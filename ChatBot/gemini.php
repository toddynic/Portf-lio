<?php

header("Content-Type: text/plain; charset=UTF-8");

$apiKey = "KEY"; // coloque sua API KEY aqui

$prompt = $_POST["mensagem"] ?? "";

if (!$prompt) {
    echo "Nenhuma mensagem recebida.";
    exit;
}

$url = "https://generativelanguage.googleapis.com/v1beta/models/gemini-2.0-flash:generateContent?key=" . $apiKey;

// Corpo da requisição
$data = [
    "systemInstruction" => [
        "parts" => [
            [
                "text" => "
Você é especialista em enfermagem e sempre fala no contexto dela.
Escreva apenas 3 linha.
"
            ]
        ]
    ],
    "contents" => [
        [
            "parts" => [
                ["text" => $prompt]
            ]
        ]
    ]
];

$payload = json_encode($data);

// CURL
$ch = curl_init($url);
curl_setopt($ch, CURLOPT_RETURNTRANSFER, true);
curl_setopt($ch, CURLOPT_POST, true);
curl_setopt($ch, CURLOPT_HTTPHEADER, [
    "Content-Type: application/json"
]);
curl_setopt($ch, CURLOPT_POSTFIELDS, $payload);

$response = curl_exec($ch);
curl_close($ch);

// Decodifica a resposta da API
$json = json_decode($response, true);

if (isset($json["candidates"][0]["content"]["parts"][0]["text"])) {
    echo $json["candidates"][0]["content"]["parts"][0]["text"];
} else {
    echo "Erro ao gerar resposta.";
}
?>
