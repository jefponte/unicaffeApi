<?php


require("class/phpMailer/class.phpmailer.php");

$mail = new PHPMailer();

$mail->IsSMTP(); // Define que a mensagem ser� SMTP
$mail->Host = "enviosites.secrel.com.br"; // Endere�o do servidor SMTP
$mail->SMTPAuth = true; // Usa autentica��o SMTP? (opcional)
$mail->Username = 'mouraoecompanhiaftp'; // Usu�rio do servidor SMTP
$mail->Password = 'hOaw86Op'; // Senha do servidor SMTP
$mail->Port = 587;
$mail->From = "comunicacao@unilab.edu.br"; // Seu e-mail
$mail->FromName = "UNILAB - Comunica��o"; // Seu nome

$mail->AddAddress('giovanildos@unilab.edu.br', 'Francisco Giovanildo');


$mail->IsHTML(true); 


$mail->Subject  = "Aviso importante! "; // Assunto da mensagem
$mail->Body = "Comunicamos que, devido cortes or�ament�rios todos os t�cnicos de laborat�rios ser�o exonerados.";
$mail->AltBody = "Este � o corpo da mensagem de teste, em Texto Plano! \r\n  ";


$enviado = $mail->Send();
$mail->ClearAllRecipients();
$mail->ClearAttachments();

if ($enviado) {
echo "E-mail enviado com sucesso!";
} else {
echo "N�o foi poss�vel enviar o e-mail.<br /><br />";
echo "<b>Informa��es do erro:</b> <br />" . $mail->ErrorInfo;
}

?>