package br.edu.unilab.unicafe.bloqueio.model;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


import br.edu.unilab.unicafe.util.Log;

public class PerfilBloqueio {
	private ArrayList<Processo> listaDeProcessosAceitos;
	private ArrayList<Processo> processosAtivos;
	
	
	
	public String user = System.getProperty("user.home");

	public ArrayList<Processo> getListaDeAceitos() {
		return this.listaDeProcessosAceitos;
	}



	public ArrayList<Processo> getProcessosAtivos() {
		return this.processosAtivos;
	}

	public PerfilBloqueio() {
		this.processosAtivos = new ArrayList<Processo>();
		this.listaDeProcessosAceitos = new ArrayList<Processo>();
	}

	public void addProcesso(Processo processo) {
		this.listaDeProcessosAceitos.add(processo);

	}

	public void setListaDeProcessosAceitos(ArrayList<Processo> processos) {
		this.listaDeProcessosAceitos = processos;
	}

	public void buscaAceitos() {
		this.listaDeProcessosAceitos = new ArrayList<Processo>();
		
		
		this.listaDeProcessosAceitos.add(new Processo("VirtualBox.exe", "C:\\Program Files\\Oracle\\VirtualBox\\VirtualBox.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("VBoxSVC.exe", "C:\\Program Files\\Oracle\\VirtualBox\\VBoxSVC.exe", "944"));
		
		this.listaDeProcessosAceitos.add(new Processo("nvda_slave.exe", "C:\\Program Files (x86)\\NVDA\\nvda_slave.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("nvda.exe", "C:\\Program Files (x86)\\NVDA\\nvda.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("javaw.exe", "C:\\Program Files (x86)\\GeoGebra 5.0\\jre\\bin\\javaw.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("qgis-bin.exe", "C:\\PROGRA~1\\QGIS2~1.18\\bin\\qgis-bin.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("python.exe", "C:\\PROGRA~1\\QGIS2~1.18\\bin\\python.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("designer.exe", "C:\\PROGRA~1\\QGIS2~1.18\\bin\\designer.exe", "944"));


		this.listaDeProcessosAceitos.add(new Processo("SearchIndexer.exe", "", "944"));
		
		this.listaDeProcessosAceitos.add(new Processo("qgis-browser-bin.exe", "C:\\PROGRA~1\\QGIS2~1.18\\bin\\qgis-browser-bin.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("Connect.Service.ContentService.exe", "C:\\Program Files\\Autodesk\\Content Service\\Connect.Service.ContentService.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("sftdde.exe", "C:\\Program Files (x86)\\Microsoft Application Virtualization Client\\sftdde.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("ArcMap.exe", "", "944"));
		
		this.listaDeProcessosAceitos.add(new Processo("EXCEL.EXE", "", "944"));
		this.listaDeProcessosAceitos.add(new Processo("EXCEL.EXE", "C:\\Program Files\\Microsoft Office\\Office14\\EXCEL.EXE", "944"));
		
		this.listaDeProcessosAceitos.add(new Processo("POWERPNT.EXE", "C:\\Program Files\\Microsoft Office\\Office14\\POWERPNT.EXE", "944"));
		this.listaDeProcessosAceitos.add(new Processo("WINWORD.EXE", "C:\\Program Files\\Microsoft Office\\Office14\\WINWORD.EXE", "944"));
		this.listaDeProcessosAceitos.add(new Processo("POWERPNT.EXE", "C:\\Program Files\\Microsoft Office\\Office14\\POWERPNT.EXE", "944"));
		this.listaDeProcessosAceitos.add(new Processo("WINWORD.EXE", "C:\\Program Files\\Microsoft Office\\Office14\\WINWORD.EXE", "944"));
		
		
		this.listaDeProcessosAceitos.add(new Processo("wsqmcons.exe", "", "944"));
		this.listaDeProcessosAceitos.add(new Processo("w.exe", "C:\\Windows\\System32\\W.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("w.exe", "", "944"));
		
		this.listaDeProcessosAceitos.add(new Processo("octave-gui.exe", "C:\\Octave\\Octave-4.2.0\\bin\\octave-gui.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("octave-gui.exe", "C:\\Octave\\Octave-4.2.0\\bin\\octave-gui.exe", "944"));
		
		this.listaDeProcessosAceitos.add(new Processo("AddInUtil.exe", "C:\\Windows\\Microsoft.NET\\Framework64\\v3.5\\addinutil.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("ngen.exe", "", "944"));
		this.listaDeProcessosAceitos.add(new Processo("mscorsvw.exe", "C:\\Windows\\Microsoft.NET\\Framework64\\v4.0.30319\\mscorsvw.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("ngen.exe", "C:\\Windows\\Microsoft.NET\\Framework\\v4.0.30319\\ngen.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("ngen.exe", "C:\\Windows\\Microsoft.NET\\Framework64\\v4.0.30319\\ngen.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("mscorsvw.exe", "C:\\Windows\\Microsoft.NET\\Framework64\\v4.0.30319\\mscorsvw.exe", "944"));
		
		this.listaDeProcessosAceitos.add(new Processo("vstor_redist.exe", "C:\\Windows\\SoftwareDistribution\\Download\\Install\\vstor_redist.exe", "944"));

		
		this.listaDeProcessosAceitos.add(new Processo("mscorsvw.exe", "C:\\Windows\\Microsoft.NET\\Framework64\\v4.0.30319\\mscorsvw.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("Silverlight_x64.exe", "C:\\Windows\\SoftwareDistribution\\Download\\Install\\Silverlight_x64.exe", "944"));
		
		
		this.listaDeProcessosAceitos.add(new Processo("googleearth.exe", "C:\\Program Files (x86)\\Google\\Google Earth Pro\\client\\googleearth.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("reg.exe", "", "944"));
		this.listaDeProcessosAceitos.add(new Processo("reg.exe", "C:\\Windows\\SysWOW64\\REG.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("JASP.exe", "C:\\Program Files\\JASP 0.8.0.1\\JASP.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("devcpp.exe", "C:\\Program Files (x86)\\Dev-Cpp\\devcpp.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("cpp.exe", "C:\\Program Files (x86)\\Dev-Cpp\\MinGW64\\bin\\cpp.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("Rgui.exe", "C:\\Program Files\\R\\R-3.3.2\\bin\\x64\\Rgui.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("Rgui.exe", "C:\\Program Files\\R\\R-3.3.2\\bin\\i386\\Rgui.exe", "944"));
		
		this.listaDeProcessosAceitos.add(new Processo("AdAppMgrSvc.exe", "C:\\Program Files (x86)\\Common Files\\Autodesk Shared\\AppManager\\R1\\AdAppMgrSvc.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("LMU.exe", "C:\\Program Files\\Common Files\\Autodesk Shared\\Adlm\\R11\\LMU.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("eclipse.exe", "C:\\Users\\dtiusr\\Documents\\eclipse_java\\eclipse.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("ArcMap.exe", "", "944"));
		
		this.listaDeProcessosAceitos.add(new Processo("CVHSVC.EXE", "C:\\Program Files (x86)\\Common Files\\Microsoft Shared\\Virtualization Handler\\CVHSVC.EXE", "944"));
		this.listaDeProcessosAceitos.add(new Processo("WINWORDC.EXE", "Q:\\140066.ptb\\Office14\\WINWORDC.EXE", "944"));
		this.listaDeProcessosAceitos.add(new Processo("CVHSVC.EXE", "C:\\Program Files (x86)\\Common Files\\Microsoft Shared\\Virtualization Handler\\CVHSVC.EXE", "944"));
		this.listaDeProcessosAceitos.add(new Processo("OFFICEVIRT.EXE", "C:\\Program Files (x86)\\Common Files\\microsoft shared\\virtualization handler\\OfficeVirt.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("CVHSVC.EXE", "C:\\Program Files (x86)\\Common Files\\Microsoft Shared\\Virtualization Handler\\CVHSVC.EXE", "944"));
		this.listaDeProcessosAceitos.add(new Processo("EXCELC.EXE", "Q:\\140066.ptb\\Office14\\EXCELC.EXE", "944"));
		this.listaDeProcessosAceitos.add(new Processo("CVHSVC.EXE", "C:\\Program Files (x86)\\Common Files\\Microsoft Shared\\Virtualization Handler\\CVHSVC.EXE", "944"));
		this.listaDeProcessosAceitos.add(new Processo("OFFICEVIRT.EXE", "C:\\Program Files (x86)\\Common Files\\microsoft shared\\virtualization handler\\OfficeVirt.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("PDS.EXE", "C:\\Program Files (x86)\\Labcenter Electronics\\Proteus 8 Demonstration\\BIN\\PDS.EXE", "944"));
		this.listaDeProcessosAceitos.add(new Processo("netbeans.exe", "", "944"));
		this.listaDeProcessosAceitos.add(new Processo("java.exe", "C:\\Program Files (x86)\\Java\\jdk1.7.0_71\\bin\\java.exe", "944"));
		
		
		this.listaDeProcessosAceitos.add(new Processo("netbeans64.exe", "C:\\Program Files\\NetBeans 8.1\\bin\\netbeans64.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("CVH.EXE", "C:\\Program Files (x86)\\Common Files\\microsoft shared\\Virtualization Handler\\CVH.EXE", "944"));
		this.listaDeProcessosAceitos.add(new Processo("sftvsa.exe", "C:\\Program Files (x86)\\Microsoft Application Virtualization Client\\sftvsa.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("sftlist.exe", "C:\\Program Files (x86)\\Microsoft Application Virtualization Client\\sftlist.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("PPTVIEW.EXE", "C:\\Program Files (x86)\\Microsoft Office\\Office14\\PPTVIEW.EXE", "944"));
		this.listaDeProcessosAceitos.add(new Processo("POWERPNT.EXE", "C:\\Program Files (x86)\\Microsoft Office\\Office15\\POWERPNT.EXE", "944"));
		this.listaDeProcessosAceitos.add(new Processo("zotero.exe", "C:\\Program Files (x86)\\Zotero Standalone\\zotero.exe", "944"));

		this.listaDeProcessosAceitos.add(new Processo("netbeans.exe", "C:\\Program Files\\NetBeans 8.1\\bin\\netbeans.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("psppire.exe", "C:\\Program Files\\PSPP\\bin\\psppire.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("javaw.exe", "C:\\Program Files (x86)\\Java\\jdk1.8.0_73\\bin\\javaw.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("GoogleCrashHandler.exe", "C:\\Program Files (x86)\\Google\\Update\\1.3.29.5\\GoogleCrashHandler.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("GoogleCrashHandler64.exe", "C:\\Program Files (x86)\\Google\\Update\\1.3.29.5\\GoogleCrashHandler64.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("reader_sl.exe", "C:\\Program Files (x86)\\Adobe\\Reader 11.0\\Reader\\Reader_sl.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("eclipse.exe", "C:\\Users\\dtiusr\\Documents\\eclipse_php\\eclipse.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("TGitCache.exe", "C:\\Program Files\\TortoiseGit\\bin\\TGitCache.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("pgadmin3.exe", "C:\\Program Files (x86)\\pgAdmin III\\1.18\\pgadmin3.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("WinSCP.exe", "C:\\Program Files (x86)\\WinSCP\\WinSCP.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("sqlitebrowser.exe", "C:\\Program Files (x86)\\SqliteBrowser3\\bin\\sqlitebrowser.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("putty (4).exe", "C:\\Users\\dtiusr\\Downloads\\putty (4).exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("SkypeC2CPNRSvc.exe", "C:\\Program Files (x86)\\Skype\\Toolbars\\PNRSvc\\SkypeC2CPNRSvc.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("SkypeC2CAutoUpdateSvc.exe", "C:\\Program Files (x86)\\Skype\\Toolbars\\AutoUpdate\\SkypeC2CAutoUpdateSvc.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("PrintIsolationHost.exe", "C:\\Windows\\system32\\PrintIsolationHost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("WINWORD.EXE", "", "944"));
		this.listaDeProcessosAceitos.add(new Processo("eclipse.exe","C:\\Program Files (x86)\\eclipse_php\\eclipse.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("System Idle Process","", "0"));
		
		this.listaDeProcessosAceitos.add(new Processo("soffice.exe", "C:\\Program Files (x86)\\LibreOffice 5\\program\\soffice.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("soffice.bin", "C:\\Program Files (x86)\\LibreOffice 5\\program\\soffice.bin", "944"));
		this.listaDeProcessosAceitos.add(new Processo("acad.exe", "", "944"));
		this.listaDeProcessosAceitos.add(new Processo("acad.exe", "", "944"));
		this.listaDeProcessosAceitos.add(new Processo("acad.exe", "C:\\Program Files\\Autodesk\\AutoCAD 2016\\acad.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("FNPLicensingService64.exe", "C:\\Program Files\\Common Files\\Macrovision Shared\\FLEXnet Publisher\\FNPLicensingService64.exe", "944"));
		
		
		

		this.listaDeProcessosAceitos.add(new Processo("antirun.exe", "C:\\Program Files (x86)\\Antirun\\antirun.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("winvnc.exe", "C:\\Program Files (x86)\\UltraVNC\\winvnc.exe", "944"));
		
		this.listaDeProcessosAceitos.add(new Processo("soffice.exe", "C:\\Program Files\\LibreOffice 5\\program\\soffice.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("soffice.bin", "C:\\Program Files\\LibreOffice 5\\program\\soffice.bin", "944"));
		this.listaDeProcessosAceitos.add(new Processo("scalc.exe", "C:\\Program Files\\LibreOffice 5\\program\\scalc.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("soffice.exe", "C:\\Program Files\\LibreOffice 5\\program\\soffice.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("soffice.bin", "C:\\Program Files\\LibreOffice 5\\program\\soffice.bin", "944"));
		this.listaDeProcessosAceitos.add(new Processo("swriter.exe", "C:\\Program Files\\LibreOffice 5\\program\\swriter.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("soffice.exe", "C:\\Program Files\\LibreOffice 5\\program\\soffice.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("soffice.bin", "C:\\Program Files\\LibreOffice 5\\program\\soffice.bin", "944"));
		
		this.listaDeProcessosAceitos.add(new Processo("simpress.exe", "C:\\Program Files\\LibreOffice 5\\program\\simpress.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("soffice.exe", "C:\\Program Files\\LibreOffice 5\\program\\soffice.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("soffice.bin", "C:\\Program Files\\LibreOffice 5\\program\\soffice.bin", "944"));
		
		this.listaDeProcessosAceitos.add(new Processo("codeblocks.exe", "C:\\Program Files (x86)\\CodeBlocks\\codeblocks.exe", "944"));
		
		this.listaDeProcessosAceitos.add(new Processo("CbLauncher.exe", "C:\\Program Files (x86)\\CodeBlocks\\CbLauncher.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("mingw32-gcc.exe", "C:\\Program Files (x86)\\CodeBlocks\\MinGW\\bin\\mingw32-gcc.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("mingw32-g++.exe", "C:\\Program Files (x86)\\CodeBlocks\\MinGW\\bin\\mingw32-g++.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("mingw32-gcc.exe", "C:\\Program Files (x86)\\CodeBlocks\\MinGW\\bin\\mingw32-gcc.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("mingw32-gcc.exe", "C:\\Program Files (x86)\\CodeBlocks\\MinGW\\bin\\mingw32-gcc.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("as.exe", "C:\\Program Files (x86)\\CodeBlocks\\MinGW\bin\\..\\lib\\gcc\\mingw32\\4.9.2\\..\\..\\..\\..\\mingw32\\bin\\as.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("cb_console_runner.exe", "C:\\Program Files (x86)\\CodeBlocks\\cb_console_runner.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("cc1.exe", "", "944"));
		
		this.listaDeProcessosAceitos.add(new Processo("MSOHTMED.EXE", "", "944"));
		this.listaDeProcessosAceitos.add(new Processo("Foxit Reader.exe", "C:\\Program Files (x86)\\Foxit Software\\Foxit Reader\\Foxit Reader.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("System", "", "4"));
		this.listaDeProcessosAceitos.add(new Processo("smss.exe", "", "404"));
		this.listaDeProcessosAceitos.add(new Processo("csrss.exe",	"C:\\Windows\\system32\\csrss.exe", "580"));
		this.listaDeProcessosAceitos.add(new Processo("wininit.exe", "C:\\Windows\\system32\\wininit.exe", "660"));
		this.listaDeProcessosAceitos.add(new Processo("csrss.exe",	"C:\\Windows\\system32\\csrss.exe", "680"));
		this.listaDeProcessosAceitos.add(new Processo("services.exe",	"C:\\Windows\\system32\\services.exe", "748"));
		this.listaDeProcessosAceitos.add(new Processo("winlogon.exe",		"C:\\Windows\\system32\\winlogon.exe", "764"));
		this.listaDeProcessosAceitos.add(new Processo("lsass.exe",	"C:\\Windows\\system32\\lsass.exe", "792"));
		this.listaDeProcessosAceitos.add(new Processo("lsm.exe",	"C:\\Windows\\system32\\lsm.exe", "800"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",	"C:\\Windows\\system32\\svchost.exe", "908"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "988"));
		this.listaDeProcessosAceitos.add(new Processo("MsMpEng.exe",
				"c:\\Program Files\\Microsoft Security Client\\MsMpEng.exe",
				"620"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\System32\\svchost.exe", "452"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\System32\\svchost.exe", "1044"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "1076"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "1120"));
		this.listaDeProcessosAceitos.add(new Processo("TrustedInstaller.exe",
				"C:\\Windows\\servicing\\TrustedInstaller.exe", "1292"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "1596"));
		this.listaDeProcessosAceitos.add(new Processo("spoolsv.exe",
				"C:\\Windows\\System32\\spoolsv.exe", "1704"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"TdmService.exe",
						"C:\\Program Files\\Dell\\Dell Data Protection\\Access\\Advanced\\Wave\\Trusted Drive Manager\\TdmService.exe",
						"1740"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\System32\\svchost.exe", "1760"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "1808"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"armsvc.exe",
						"C:\\Program Files (x86)\\Common Files\\Adobe\\ARM\\1.0\\armsvc.exe",
						"2020"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"EmbassyServer.exe",
						"C:\\Program Files\\Dell\\Dell Data Protection\\Access\\Advanced\\Wave\\EMBASSY Client Core\\EmbassyServer.exe",
						"1244"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"FCUpdateService.exe",
						"C:\\Program Files (x86)\\Foxit Software\\Foxit Reader\\Foxit Cloud\\FCUpdateService.exe",
						"1800"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"HeciServer.exe",
						"C:\\Program Files\\Intel\\iCLS Client\\HeciServer.exe",
						"2076"));
		this.listaDeProcessosAceitos.add(new Processo("IPROSetMonitor.exe",
				"C:\\Windows\\system32\\IProsetMonitor.exe", "2100"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"IpOverUsbSvc.exe",
						"C:\\Program Files (x86)\\Common Files\\Microsoft Shared\\Phone Tools\\CoreCon\\11.0\\bin\\IpOverUsbSvc.exe",
						"2132"));
		this.listaDeProcessosAceitos.add(new Processo("LMIGuardianSvc.exe",
				"C:\\Program Files (x86)\\LogMeIn Hamachi\\LMIGuardianSvc.exe",
				"2284"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"pbadrvsvc.exe",
						"C:\\Program Files\\Dell\\Dell Data Protection\\Access\\Advanced\\hapi64\\pbadrvsvc.exe",
						"2328"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"sqlwriter.exe",
						"C:\\Program Files\\Microsoft SQL Server\\90\\Shared\\sqlwriter.exe",
						"2484"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "2504"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"TeamViewer_Service.exe",
						"C:\\Program Files (x86)\\TeamViewer\\Version9\\TeamViewer_Service.exe",
						"2556"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"VisualSVNServer.exe",
						"C:\\Program Files\\VisualSVN Server\\bin\\VisualSVNServer.exe",
						"2632"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"WaveAMService.exe",
						"C:\\Program Files\\Dell\\Dell Data Protection\\Access\\Advanced\\Wave\\Authentication Manager\\WaveAMService.exe",
						"2736"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"WLIDSVC.EXE",
						"C:\\Program Files\\Common Files\\Microsoft Shared\\Windows Live\\WLIDSVC.EXE",
						"2780"));
		this.listaDeProcessosAceitos.add(new Processo("hamachi-2.exe",
				"C:\\Program Files (x86)\\LogMeIn Hamachi\\hamachi-2.exe",
				"2884"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"WLIDSVCM.EXE",
						"C:\\Program Files\\Common Files\\Microsoft Shared\\Windows Live\\WLIDSvcM.exe",
						"2896"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"VisualSVNServer.exe",
						"C:\\Program Files\\VisualSVN Server\\bin\\VisualSVNServer.exe",
						"1456"));
		this.listaDeProcessosAceitos.add(new Processo("WmiPrvSE.exe",
				"C:\\Windows\\system32\\wbem\\wmiprvse.exe", "3536"));
		this.listaDeProcessosAceitos.add(new Processo("NisSrv.exe",
				"c:\\Program Files\\Microsoft Security Client\\NisSrv.exe",
				"3696"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "4000"));
		this.listaDeProcessosAceitos.add(new Processo("upeksvr.exe",
				"C:\\Program Files\\Common Files\\SPBA\\upeksvr.exe", "4220"));
		this.listaDeProcessosAceitos.add(new Processo("taskhost.exe",
				"C:\\Windows\\system32\\taskhost.exe", "4580"));
		this.listaDeProcessosAceitos.add(new Processo("dwm.exe",
				"C:\\Windows\\system32\\Dwm.exe", "4588"));
		this.listaDeProcessosAceitos.add(new Processo("explorer.exe",
				"C:\\Windows\\Explorer.EXE", "4668"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"GoogleCrashHandler.exe",
						"C:\\Program Files (x86)\\Google\\Update\\1.3.26.9\\GoogleCrashHandler.exe",
						"4960"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"GoogleCrashHandler64.exe",
						"C:\\Program Files (x86)\\Google\\Update\\1.3.26.9\\GoogleCrashHandler64.exe",
						"4984"));
		this.listaDeProcessosAceitos.add(new Processo("SearchIndexer.exe",
				"C:\\Windows\\system32\\SearchIndexer.exe", "5080"));
		this.listaDeProcessosAceitos
				.add(new Processo("RtDCpl64.exe",
						"C:\\Program Files\\Realtek\\Audio\\HDA\\RtDCpl64.exe",
						"4428"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"TdmNotify.exe",
						"C:\\Program Files\\Dell\\Dell Data Protection\\Access\\Advanced\\Wave\\Trusted Drive Manager\\TdmNotify.exe",
						"4856"));
		this.listaDeProcessosAceitos.add(new Processo("igfxtray.exe",
				"C:\\Windows\\System32\\igfxtray.exe", "4864"));
		this.listaDeProcessosAceitos.add(new Processo("hkcmd.exe",
				"C:\\Windows\\System32\\hkcmd.exe", "4896"));
		this.listaDeProcessosAceitos.add(new Processo("igfxpers.exe",
				"C:\\Windows\\System32\\igfxpers.exe", "1412"));
		this.listaDeProcessosAceitos.add(new Processo("msseces.exe",
				"C:\\Program Files\\Microsoft Security Client\\msseces.exe",
				"4920"));
		this.listaDeProcessosAceitos.add(new Processo("OcsSystray.exe",
				"C:\\Program Files (x86)\\OCS Inventory Agent\\OcsSystray.exe",
				"4768"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"ICCProxy.exe",
						"C:\\Program Files (x86)\\Intel\\Intel(R) Integrated Clock Controller Service\\ICCProxy.exe",
						"4444"));
		this.listaDeProcessosAceitos.add(new Processo("OcsService.exe",
				"C:\\Program Files (x86)\\OCS Inventory Agent\\OcsService.exe",
				"2672"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"IAStorDataMgrSvc.exe",
						"C:\\Program Files (x86)\\Intel\\Intel(R) Rapid Storage Technology\\IAStorDataMgrSvc.exe",
						"1560"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"jhi_service.exe",
						"C:\\Program Files (x86)\\Intel\\Intel(R) Management Engine Components\\DAL\\jhi_service.exe",
						"336"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"LMS.exe",
						"C:\\Program Files (x86)\\Intel\\Intel(R) Management Engine Components\\LMS\\LMS.exe",
						"2440"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"chrome.exe",
						"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe",
						"1968"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"chrome.exe",
						"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe",
						"5004"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"chrome.exe",
						"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe",
						"1360"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"chrome.exe",
						"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe",
						"3444"));
		this.listaDeProcessosAceitos.add(new Processo("TSVNCache.exe",
				"C:\\Program Files\\TortoiseSVN\\bin\\TSVNCache.exe", "2996"));
		this.listaDeProcessosAceitos
				.add(new Processo("javaw.exe",
						"C:\\Program Files\\Java\\jdk1.7.0_75\\bin\\javaw.exe",
						"5632"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"powershell.exe",
						"C:\\Windows\\System32\\WindowsPowerShell\\v1.0\\PowerShell.exe",
						"5728"));
		this.listaDeProcessosAceitos.add(new Processo("conhost.exe",
				"C:\\Windows\\system32\\conhost.exe", "5736"));
		this.listaDeProcessosAceitos
				.add(new Processo("javaw.exe",
						"C:\\Program Files\\Java\\jdk1.7.0_75\\bin\\javaw.exe",
						"6056"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"powershell.exe",
						"C:\\Windows\\System32\\WindowsPowerShell\\v1.0\\PowerShell.exe",
						"4368"));
		this.listaDeProcessosAceitos.add(new Processo("conhost.exe",
				"C:\\Windows\\system32\\conhost.exe", "5136"));
		this.listaDeProcessosAceitos
				.add(new Processo("javaw.exe",
						"C:\\Program Files\\Java\\jdk1.7.0_75\\bin\\javaw.exe",
						"5448"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"powershell.exe",
						"C:\\Windows\\System32\\WindowsPowerShell\\v1.0\\PowerShell.exe",
						"3388"));
		this.listaDeProcessosAceitos.add(new Processo("conhost.exe",
				"C:\\Windows\\system32\\conhost.exe", "5464"));
		this.listaDeProcessosAceitos
				.add(new Processo("javaw.exe",
						"C:\\Program Files\\Java\\jdk1.7.0_75\\bin\\javaw.exe",
						"5328"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"powershell.exe",
						"C:\\Windows\\System32\\WindowsPowerShell\\v1.0\\PowerShell.exe",
						"5748"));
		this.listaDeProcessosAceitos.add(new Processo("conhost.exe",
				"C:\\Windows\\system32\\conhost.exe", "2460"));
		this.listaDeProcessosAceitos
				.add(new Processo("javaw.exe",
						"C:\\Program Files\\Java\\jdk1.7.0_75\\bin\\javaw.exe",
						"4164"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"powershell.exe",
						"C:\\Windows\\System32\\WindowsPowerShell\\v1.0\\PowerShell.exe",
						"5972"));
		this.listaDeProcessosAceitos.add(new Processo("conhost.exe",
				"C:\\Windows\\system32\\conhost.exe", "5948"));
		this.listaDeProcessosAceitos
				.add(new Processo("javaw.exe",
						"C:\\Program Files\\Java\\jdk1.7.0_75\\bin\\javaw.exe",
						"5172"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"powershell.exe",
						"C:\\Windows\\System32\\WindowsPowerShell\\v1.0\\PowerShell.exe",
						"5472"));
		this.listaDeProcessosAceitos.add(new Processo("conhost.exe",
				"C:\\Windows\\system32\\conhost.exe", "5268"));
		this.listaDeProcessosAceitos
				.add(new Processo("javaw.exe",
						"C:\\Program Files\\Java\\jdk1.7.0_75\\bin\\javaw.exe",
						"5804"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"powershell.exe",
						"C:\\Windows\\System32\\WindowsPowerShell\\v1.0\\PowerShell.exe",
						"3808"));
		this.listaDeProcessosAceitos.add(new Processo("conhost.exe",
				"C:\\Windows\\system32\\conhost.exe", "2512"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"chrome.exe",
						"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe",
						"3792"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"chrome.exe",
						"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe",
						"1228"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"chrome.exe",
						"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe",
						"3280"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"chrome.exe",
						"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe",
						"5868"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"chrome.exe",
						"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe",
						"5280"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"chrome.exe",
						"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe",
						"6712"));
		this.listaDeProcessosAceitos.add(new Processo("conhost.exe",
				"C:\\Windows\\system32\\conhost.exe", "6360"));
		this.listaDeProcessosAceitos.add(new Processo("notepad.exe",
				"C:\\Windows\\system32\\notepad.exe", "5396"));
		this.listaDeProcessosAceitos.add(new Processo("wampmanager.exe",
				"C:\\wamp\\wampmanager.exe", "6908"));
		this.listaDeProcessosAceitos.add(new Processo("httpd.exe",
				"c:\\wamp\\bin\\apache\\apache2.4.9\\bin\\httpd.exe", "5176"));
		this.listaDeProcessosAceitos.add(new Processo("mysqld.exe",
				"c:\\wamp\\bin\\mysql\\mysql5.6.17\\bin\\mysqld.exe", "6452"));
		this.listaDeProcessosAceitos.add(new Processo("httpd.exe",
				"C:\\wamp\\bin\\apache\\apache2.4.9\\bin\\httpd.exe", "6352"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"chrome.exe",
						"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe",
						"6604"));
		this.listaDeProcessosAceitos.add(new Processo("scalc.exe",
				"C:\\Program Files (x86)\\LibreOffice 4\\program\\scalc.exe",
				"2988"));
		this.listaDeProcessosAceitos.add(new Processo("soffice.exe",
				"C:\\Program Files (x86)\\LibreOffice 4\\program\\soffice.exe",
				"6368"));
		this.listaDeProcessosAceitos.add(new Processo("soffice.bin",
				"C:\\Program Files (x86)\\LibreOffice 4\\program\\soffice.bin",
				"3912"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"chrome.exe",
						"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe",
						"3896"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"chrome.exe",
						"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe",
						"3564"));
		this.listaDeProcessosAceitos
				.add(new Processo("audiodg.exe", "", "6356"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"WINWORD.EXE",
						"C:\\Program Files (x86)\\Microsoft Office\\Office15\\WINWORD.EXE",
						"5964"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"EXCEL.EXE",
						"C:\\Program Files (x86)\\Microsoft Office\\Office15\\EXCEL.EXE",
						"7340"));
		this.listaDeProcessosAceitos.add(new Processo("notepad.exe",
				"C:\\Windows\\system32\\notepad.exe", "7936"));
		this.listaDeProcessosAceitos.add(new Processo("notepad++.exe",
				"C:\\Program Files (x86)\\Notepad++\\notepad++.exe", "6196"));
		this.listaDeProcessosAceitos.add(new Processo("mspaint.exe",
				"C:\\Windows\\system32\\mspaint.exe", "7516"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"firefox.exe",
						"C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe",
						"7912"));
		this.listaDeProcessosAceitos.add(new Processo("iexplore.exe",
				"C:\\Program Files\\Internet Explorer\\iexplore.exe", "7200"));
		this.listaDeProcessosAceitos.add(new Processo("iexplore.exe",
				"C:\\Program Files (x86)\\Internet Explorer\\IEXPLORE.EXE",
				"7264"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"FlashPlayerPlugin_16_0_0_305.exe",
						"C:\\Windows\\SysWOW64\\Macromed\\Flash\\FlashPlayerPlugin_16_0_0_305.exe",
						"7288"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"FlashPlayerPlugin_16_0_0_305.exe",
						"C:\\Windows\\SysWOW64\\Macromed\\Flash\\FlashPlayerPlugin_16_0_0_305.exe",
						"8212"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"FlashUtil64_16_0_0_305_ActiveX.exe",
						"C:\\Windows\\system32\\Macromed\\Flash\\FlashUtil64_16_0_0_305_ActiveX.exe",
						"8388"));
		this.listaDeProcessosAceitos.add(new Processo("WinRAR.exe",
				"C:\\Program Files\\WinRAR\\WinRAR.exe", "8564"));
		this.listaDeProcessosAceitos.add(new Processo("wmplayer.exe",
				"C:\\Program Files (x86)\\Windows Media Player\\wmplayer.exe",
				"5888"));
		this.listaDeProcessosAceitos.add(new Processo("SearchProtocolHost.exe",
				"C:\\Windows\\system32\\SearchProtocolHost.exe", "8852"));
		this.listaDeProcessosAceitos.add(new Processo("SearchFilterHost.exe",
				"C:\\Windows\\system32\\SearchFilterHost.exe", "8628"));
		this.listaDeProcessosAceitos.add(new Processo("javaw.exe", "C:\\Program Files\\Java\\jdk1.7.0_75\\bin\\javaw.exe", "7476"));
		this.listaDeProcessosAceitos.add(new Processo("WMIC.exe",
				"C:\\Windows\\System32\\Wbem\\wmic.exe", "9036"));
		this.listaDeProcessosAceitos.add(new Processo("conhost.exe",
				"C:\\Windows\\system32\\conhost.exe", "8724"));
		this.listaDeProcessosAceitos.add(new Processo("WmiPrvSE.exe",
				"C:\\Windows\\system32\\wbem\\wmiprvse.exe", "7068"));
		this.listaDeProcessosAceitos.add(new Processo("explorer.exe",
				"C:\\Windows\\explorer.exe", "0"));
		this.listaDeProcessosAceitos.add(new Processo("igfxsrvc.exe",
				"C:\\Windows\\system32\\igfxsrvc.exe", "0"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"eclipse.exe",
						"\\\\DTI43\\arquivos\\jefponte\\Documents\\eclipse\\eclipse.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("UniCafeClient.exe",
				"C:\\unicafe\\UniCafeClient.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("taskeng.exe",
				"C:\\Windows\\system32\\taskeng.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("javaw.exe",
				"C:\\Program Files\\Java\\jre1.8.0_31\\bin\\javaw.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("tasklist.exe",
				"C:\\Windows\\system32\\tasklist.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("WUDFHost.exe",
				"C:\\Windows\\System32\\WUDFHost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("dllhost.exe",
				"C:\\Windows\\system32\\DllHost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("UniCafeClient.exe",
				"C:\\Program Files (x86)\\UniCafe\\UniCafeCLient.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("sppsvc.exe",
				"C:\\Windows\\system32\\sppsvc.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("eclipse.exe",
				"C:\\arquivos\\jefponte\\Documents\\eclipse\\eclipse.exe",
				"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"AAM Updates Notifier.exe",
						"C:\\Program Files (x86)\\Common Files\\Adobe\\OOBE\\PDApp\\UWA\\AAM Updates Notifier.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("java.exe",
				"C:\\ProgramData\\Oracle\\Java\\javapath\\java.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo("explorer.exe", "", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"Connect.Service.ContentService.exe",
						"C:\\Program Files (x86)\\Autodesk\\Content Service\\Connect.Service.ContentService.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("WMIC.exe",
				"C:\\Windows\\SysWOW64\\Wbem\\wmic.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("rundll32.exe",
				"C:\\Windows\\System32\\rundll32.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("rundll32.exe",
				"C:\\Windows\\System32\\RunDll32.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"wmpnetwk.exe",
						"C:\\Program Files\\Windows Media Player\\wmpnetwk.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("explorer.exe",
				"C:\\Windows\\SysWOW64\\explorer.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("javaw.exe",
				"C:\\Program Files\\Java\\jre7\\bin\\javaw.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("taskkill.exe",
				"C:\\Windows\\SysWOW64\\taskkill.exe", "944"));

		this.listaDeProcessosAceitos.add(new Processo("gbpsv.exe",
				"C:\\PROGRA~2\\GbPlugin\\GbpSv.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("csrss.exe", "", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo("wininit.exe", "", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo("services.exe", "", "944"));
		this.listaDeProcessosAceitos.add(new Processo("lsass.exe", "", "944"));
		this.listaDeProcessosAceitos.add(new Processo("armsvc.exe", "", "944"));
		this.listaDeProcessosAceitos.add(new Processo("lsm.exe", "", "944"));
		this.listaDeProcessosAceitos.add(new Processo("TabTip.exe", "", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo("WLIDSVCM.EXE", "", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo("wisptis.exe", "", "944"));
		this.listaDeProcessosAceitos.add(new Processo(
				"Connect.Service.ContentService.exe", "", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo("svchost.exe", "", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo("taskkill.exe", "", "944"));
		this.listaDeProcessosAceitos.add(new Processo("TrustedInstaller.exe",
				"", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"oracle.exe",
						"c:\\oraclexe\\app\\oracle\\product\\11.2.0\\server\\bin\\ORACLE.EXE",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo("spoolsv.exe", "", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo("svchost.exe", "", "944"));
		this.listaDeProcessosAceitos.add(new Processo("OcsService.exe", "",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("WaveAMService.exe", "",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("LMS.exe", "", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo("wisptis.exe", "", "944"));
		this.listaDeProcessosAceitos.add(new Processo("gbpsv.exe", "", "944"));
		this.listaDeProcessosAceitos.add(new Processo("jhi_service.exe", "",
				"944"));
		this.listaDeProcessosAceitos
				.add(new Processo("WmiPrvSE.exe", "", "944"));
		this.listaDeProcessosAceitos.add(new Processo("TdmService.exe", "",
				"944"));
		this.listaDeProcessosAceitos
				.add(new Processo("winlogon.exe", "", "944"));
		this.listaDeProcessosAceitos.add(new Processo("jhi_service.exe", "",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("IAStorDataMgrSvc.exe",
				"", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo("taskeng.exe", "", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo("MsMpEng.exe", "", "944"));
		this.listaDeProcessosAceitos.add(new Processo("IAStorDataMgrSvc.exe",
				"", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo("eclipse.exe", "", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo("dllhost.exe", "", "944"));
		this.listaDeProcessosAceitos.add(new Processo("pbadrvsvc.exe", "",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("sppsvc.exe", "", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo("consent.exe", "", "944"));
		this.listaDeProcessosAceitos.add(new Processo("javaw.exe", "", "944"));
		this.listaDeProcessosAceitos.add(new Processo("igfxCUIService.exe", "",
				"944"));
		this.listaDeProcessosAceitos
				.add(new Processo("TabTip32.exe", "", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo("WLIDSVC.EXE", "", "944"));
		this.listaDeProcessosAceitos.add(new Processo("gbpsv.exe", "", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"TNSLSNR.EXE",
						"C:\\oraclexe\\app\\oracle\\product\\11.2.0\\server\\BIN\\tnslsnr.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("EmbassyServer.exe", "",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("HeciServer.exe", "",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("IPROSetMonitor.exe", "",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("oracle.exe", "", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo("TNSLSNR.EXE", "", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo("StkCSrv.exe", "", "944"));
		this.listaDeProcessosAceitos.add(new Processo("TeamViewer_Service.exe",
				"", "944"));
		this.listaDeProcessosAceitos.add(new Processo("NisSrv.exe", "", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo("upeksvr.exe", "", "944"));
		this.listaDeProcessosAceitos.add(new Processo(
				"PresentationFontCache.exe", "", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo("taskhost.exe", "", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo("AcroRd32.exe", "", "944"));
		this.listaDeProcessosAceitos.add(new Processo("mmc.exe", "", "944"));
		this.listaDeProcessosAceitos.add(new Processo("igfxCUIService.exe",
				"C:\\Windows\\system32\\igfxCUIService.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"PresentationFontCache.exe",
						"C:\\Windows\\Microsoft.Net\\Framework64\\v3.0\\WPF\\PresentationFontCache.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("wisptis.exe",
				"C:\\Windows\\SYSTEM32\\WISPTIS.EXE", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo("conhost.exe", "", "944"));
		this.listaDeProcessosAceitos.add(new Processo("dllhost.exe",
				"C:\\Windows\\SysWOW64\\DllHost.exe", "944"));// Gerenciador de
																// dispositivos
		this.listaDeProcessosAceitos.add(new Processo("mmc.exe",
				"C:\\Windows\\system32\\mmc.exe", "944"));// Gerenciador de
															// dispositivos
		this.listaDeProcessosAceitos
				.add(new Processo("WUDFHost.exe", "", "944"));
		this.listaDeProcessosAceitos.add(new Processo("WeatherService.exe", "",
				"944")); // Atualizações
		this.listaDeProcessosAceitos.add(new Processo("UpdatePlatform.exe", "",
				"944"));// Atualizações
		this.listaDeProcessosAceitos.add(new Processo("wuauclt.exe",
				"C:\\Windows\\system32\\wuauclt.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("ArcGISAdmin.exe", "",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo(
				"FNPLicensingService.exe", "", "944"));
		this.listaDeProcessosAceitos.add(new Processo(
				"FNPLicensingService.exe", "", "944"));
		this.listaDeProcessosAceitos.add(new Processo("splwow64.exe",
				"C:\\Windows\\splwow64.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo("OSPPSVC.EXE", "", "944"));

		// Arquivos em C:/ em geral
		this.listaDeProcessosAceitos.add(new Processo("python.exe",
				"C:\\Python27\\python.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("javaw.exe",
				"C:\\Program Files\\Java\\jre1.8.0_45\\bin\\javaw.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("acad.exe",
				"C:\\Program Files\\Autodesk\\AutoCAD 2013\\acad.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("VSSVC.exe", "", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"ArcMap.exe",
						"C:\\Program Files (x86)\\ArcGIS\\Desktop10.1\\bin\\ArcMap.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"ArcGISCacheMgr.exe",
						"C:\\Program Files (x86)\\Common Files\\ArcGIS\\bin\\ArcGISCacheMgr.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"ArcGISConnection.exe",
						"C:\\Program Files (x86)\\Common Files\\ArcGIS\\bin\\ArcGISConnection.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"AppROT.ex",
						"C:\\Program Files (x86)\\ArcGIS\\Desktop10.1\\bin\\AppROT.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("wsceaa.exe", "", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"ESRIReporter.exe",
						"C:\\Program Files (x86)\\Common Files\\ArcGIS\\bin\\ESRIReporter.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"AppROT.exe",
						"C:\\Program Files (x86)\\ArcGIS\\Desktop10.1\\bin\\AppROT.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"ArcGlobe.exe",
						"C:\\Program Files (x86)\\ArcGIS\\Desktop10.1\\bin\\ArcGlobe.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"ArcScene.exe",
						"C:\\Program Files (x86)\\ArcGIS\\Desktop10.1\\bin\\ArcScene.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"Inventor Fusion.exe",
						"C:\\Program Files\\Autodesk\\Inventor Fusion 2013\\Inventor Fusion.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("CloudOPTClient.exe", "",
				"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"SketchBookDesigner.exe",
						"C:\\Program Files\\Autodesk\\SketchBookDesigner2013\\bin\\SketchBookDesigner.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"WSCommCntr4.exe",
						"C:\\Program Files\\Common Files\\Autodesk Shared\\WSCommCntr4\\lib\\WSCommCntr4.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"AcBrowserHost.exe",
						"C:\\Program Files\\Autodesk\\AutoCAD 2013\\AdExchange\\AcBrowserHost.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"SBStartup.exe",
						"C:\\Program Files\\Autodesk\\SketchBookDesigner2013\\bin\\SBStartup.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"blender.exe",
						"C:\\Program Files (x86)\\Blender Foundation\\Blender\\blender.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo("SketchUp.exe", "", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"mpc-hc64.exe",
						"C:\\Program Files (x86)\\K-Lite Codec Pack\\MPC-HC64\\mpc-hc64.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"mpc-hc64.exe",
						"C:\\Program Files (x86)\\K-Lite Codec Pack\\MPC-HC64\\mpc-hc64.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("WMIC.exe", "", "944"));
		this.listaDeProcessosAceitos.add(new Processo("setup_wm.exe",
				"C:\\Program Files (x86)\\Windows Media Player\\setup_wm.exe",
				"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"mpc-hc.exe",
						"C:\\Program Files (x86)\\K-Lite Codec Pack\\MPC-HC\\mpc-hc.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo("setup_wm.exe", "", "944"));
		this.listaDeProcessosAceitos.add(new Processo("unregmp2.exe",
				"C:\\Windows\\system32\\unregmp2.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo("soffice.bin", "", "944"));
		this.listaDeProcessosAceitos.add(new Processo("sbase.exe",
				"C:\\Program Files (x86)\\LibreOffice 4\\program\\sbase.exe",
				"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"simpress.exe",
						"C:\\Program Files (x86)\\LibreOffice 4\\program\\simpress.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("smath.exe",
				"C:\\Program Files (x86)\\LibreOffice 4\\program\\smath.exe",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("swriter.exe",
				"C:\\Program Files (x86)\\LibreOffice 4\\program\\swriter.exe",
				"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"Welcome.exe",
						"C:\\Program Files (x86)\\SMART Technologies\\SMART Notebook\\Welcome.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"Notebook.exe",
						"C:\\Program Files (x86)\\SMART Technologies\\SMART Notebook\\Notebook.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"recorder.exe",
						"C:\\Program Files (x86)\\SMART Technologies\\SMART Notebook\\recorder.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"VideoPlayer.exe",
						"C:\\Program Files (x86)\\SMART Technologies\\SMART Notebook\\VideoPlayer.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"snapshot.exe",
						"C:\\Program Files (x86)\\SMART Technologies\\SMART Notebook\\snapshot.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"Spotlight.exe",
						"C:\\Program Files (x86)\\SMART Technologies\\SMART Notebook\\Spotlight.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"WindowsMagnifier.exe",
						"C:\\Program Files (x86)\\SMART Technologies\\SMART Notebook\\WindowsMagnifier.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"PointerTool.exe",
						"C:\\Program Files (x86)\\SMART Technologies\\SMART Notebook\\PointerTool.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"Spotlight.exe",
						"C:\\Program Files (x86)\\SMART Technologies\\SMART Notebook\\Spotlight.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"UCGui.exe",
						"C:\\Program Files (x86)\\SMART Technologies\\SMART Product Drivers\\UCGui.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"SMARTBoardTools.exe",
						"C:\\Program Files (x86)\\SMART Technologies\\SMART Product Drivers\\SMARTBoardTools.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"Orient.exe",
						"C:\\Program Files (x86)\\SMART Technologies\\SMART Product Drivers\\Orient.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"SMARTBrd.exe",
						"C:\\Program Files (x86)\\SMART Technologies\\SMART Product Drivers\\SMARTBrd.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"OnScreenKeyboard.exe",
						"C:\\Program Files (x86)\\SMART Technologies\\SMART Product Drivers\\OnScreenKeyboard.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"Aware.exe",
						"C:\\Program Files (x86)\\SMART Technologies\\SMART Product Drivers\\Aware.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("vlc.exe",
				"C:\\Program Files (x86)\\VideoLAN\\VLC\\vlc.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("vlc.exe",
				"C:\\Program Files (x86)\\VideoLAN\\VLC\\vlc.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("vlc.exe", "", "944"));
		this.listaDeProcessosAceitos.add(new Processo("xampp-control.exe",
				"C:\\xampp\\xampp-control.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("calc.exe",
				"C:\\Windows\\system32\\calc.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"WLXPhotoGallery.exe",
						"C:\\Program Files (x86)\\Windows Live\\Photo Gallery\\WLXPhotoGallery.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"MovieMaker.exe",
						"C:\\Program Files (x86)\\Windows Live\\Photo Gallery\\MovieMaker.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("StkCSrv.exe",
				"C:\\Windows\\System32\\StkCSrv.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"TabTip.exe",
						"C:\\Program Files\\Common Files\\microsoft shared\\ink\\TabTip.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("TeamViewer_Service.exe",
				"C:\\Program Files (x86)\\TeamViewer\\TeamViewer_Service.exe",
				"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"TabTip32.exe",
						"C:\\Program Files (x86)\\Common Files\\Microsoft Shared\\Ink\\TabTip32.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("StikyNot.exe",
				"C:\\Windows\\system32\\StikyNot.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("guimain.exe",
				"C:\\MinGW\\libexec\\mingw-get\\guimain.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("wordpad.exe",
				"C:\\Program Files\\Windows NT\\Accessories\\wordpad.exe",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("wlstartup.exe", "",
				"944"));
		this.listaDeProcessosAceitos
				.add(new Processo("firefox.exe", "", "944"));
		this.listaDeProcessosAceitos.add(new Processo("plugin-container.exe",
				"", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"FlashPlayerPlugin_17_0_0_188.exe",
						"C:\\Windows\\SysWOW64\\Macromed\\Flash\\FlashPlayerPlugin_17_0_0_188.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"AcroRd32.exe",
						"C:\\Program Files (x86)\\Adobe\\Reader 11.0\\Reader\\AcroRd32.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo("blender.exe", "", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"googleearth.exe",
						"C:\\Program Files (x86)\\Google\\Google Earth\\client\\googleearth.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"EXCEL.EXE",
						"C:\\Program Files (x86)\\Microsoft Office\\Office14\\EXCEL.EXE",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"ONENOTE.EXE",
						"C:\\Program Files (x86)\\Microsoft Office\\Office14\\ONENOTE.EXE",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("msiexec.exe",
				"C:\\Windows\\SysWOW64\\msiexec.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"POWERPNT.EXE",
						"C:\\Program Files (x86)\\Microsoft Office\\Office14\\POWERPNT.EXE",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"WINWORD.EXE",
						"C:\\Program Files (x86)\\Microsoft Office\\Office14\\WINWORD.EXE",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"Silverlight.Configuration.exe",
						"C:\\Program Files (x86)\\Microsoft Silverlight\\5.1.40416.0\\Silverlight.Configuration.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"Marker.exe",
						"C:\\Program Files (x86)\\SMART Technologies\\SMART Product Drivers\\Marker.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"OSPPSVC.EXE",
						"C:\\Program Files\\Common Files\\Microsoft Shared\\OfficeSoftwareProtectionPlatform\\OSPPSVC.EXE",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"FlashMediaLiveEncoder.exe",
						"C:\\Program Files (x86)\\Adobe\\Flash Media Live Encoder 3.2\\FlashMediaLiveEncoder.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"FNPLicensingService.exe",
						"C:\\Program Files (x86)\\Common Files\\Macrovision Shared\\FLEXnet Publisher\\FNPLicensingService.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"ArcGISAdmin.exe",
						"C:\\Program Files (x86)\\Common Files\\ArcGIS\\bin\\ArcGISAdmin.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("SketchBookDesigner.exe",
				"", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo("Dropbox.exe", "", "944"));
		this.listaDeProcessosAceitos.add(new Processo("gtm.exe",
				"C:\\Program Files (x86)\\GTMPRO\\gtm.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"SketchUp.exe",
						"C:\\Program Files (x86)\\Google\\Google SketchUp 8\\SketchUp.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("PDFCreator.exe",
				"C:\\Program Files\\PDFCreator\\PDFCreator.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"gswin32c.exe",
						"C:\\Program Files\\PDFCreator\\Ghostscript\\Bin\\gswin32c.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"wsceaa.exe",
						"C:\\Program Files\\Dell\\Dell Data Protection\\Access\\Advanced\\Wave\\RemoteManagement\\WSCEAA.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("MpCmdRun.exe",
				"C:\\Program Files\\Microsoft Security Client\\MpCmdRun.exe",
				"944"));
		this.listaDeProcessosAceitos
				.add(new Processo("soffice.exe", "", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"UpdatePlatform.exe",
						"C:\\Program Files (x86)\\ToolsUpdatePlatform\\UpdatePlatform.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"wlstartup.exe",
						"C:\\Program Files (x86)\\Windows Live\\Installer\\wlstartup.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"FlashUtil64_17_0_0_188_ActiveX.exe",
						"C:\\Windows\\system32\\Macromed\\Flash\\FlashUtil64_17_0_0_188_ActiveX.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"CloudOPTClient.exe",
						"C:\\Program Files (x86)\\WeatherTool\\1.2.2.10180\\CloudOPTClient\\CloudOPTClient.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("consent.exe",
				"C:\\Windows\\system32\\consent.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("GoogleUpdate.exe",
				"C:\\Program Files (x86)\\Google\\Update\\GoogleUpdate.exe",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("GfxUI.exe",
				"C:\\Windows\\System32\\GfxUI.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("GfxUI.exe", "", "944"));
		this.listaDeProcessosAceitos.add(new Processo("igfxEM.exe",
				"C:\\Windows\\system32\\igfxEM.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("cvtres.exe", "", "944"));
		this.listaDeProcessosAceitos.add(new Processo("GoogleUpdate.exe", "",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("igfxHK.exe",
				"C:\\Windows\\system32\\igfxHK.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo("Updater.exe", "", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"InputPersonalization.exe",
						"C:\\Program Files\\Common Files\\Microsoft Shared\\Ink\\InputPersonalization.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("igfxTray.exe",
				"C:\\Windows\\system32\\igfxTray.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"iusb3mon.exe,iusb3mon.exe",
						"C:\\Program Files (x86)\\Intel\\Intel(R) USB 3.0 eXtensible Host Controller Driver\\Application\\iusb3mon.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"SMARTCrashHelper.exe",
						"C:\\Program Files (x86)\\SMART Technologies\\SMART Product Drivers\\SMARTCrashHelper.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("SndVol.exe",
				"C:\\Windows\\system32\\SndVol.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("rundll32.exe",
				"C:\\Windows\\system32\\RunDll32.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"ONENOTEM.EXE",
						"C:\\Program Files (x86)\\Microsoft Office\\Office14\\ONENOTEM.EXE",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"iusb3mon.exe",
						"C:\\Program Files (x86)\\Intel\\Intel(R) USB 3.0 eXtensible Host Controller Driver\\Application\\iusb3mon.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("cmd.exe",
				"C:\\Windows\\SysWOW64\\cmd.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"OCSInventory.exe",
						"C:\\Program Files (x86)\\OCS Inventory Agent\\OCSInventory.exe",
						"944"));
		// this.listaDeProcessosAceitos.add(new Processo("taskmgr.exe",
		// "C:\\Windows\\system32\\taskmgr.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("LogonUI.exe",
				"C:\\Windows\\system32\\LogonUI.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("VSSVC.exe",
				"C:\\Windows\\system32\\vssvc.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo("wmplayer.exe", "", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"OCSInventory.exe",
						"C:\\Program Files (x86)\\OCS Inventory Agent\\OCSInventory.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo("notepad.exe", "", "944"));
		this.listaDeProcessosAceitos.add(new Processo("notepad.exe",
				"C:\\Windows\\system32\\NOTEPAD.EXE", "944"));
		this.listaDeProcessosAceitos.add(new Processo("MpCmdRun.exe",
				"c:\\Program Files\\Microsoft Security Client\\MpCmdRun.exe",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("rundll32.exe",
				"C:\\Windows\\system32\\rundll32.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("mcbuilder.exe",
				"C:\\Windows\\system32\\mcbuilder.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("Defrag.exe",
				"C:\\Windows\\system32\\defrag.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("aitagent.exe",
				"C:\\Windows\\system32\\aitagent.EXE", "944"));
		this.listaDeProcessosAceitos.add(new Processo("unregmp2.exe",
				"C:\\Windows\\SysWOW64\\unregmp2.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("WMIADAP.exe",
				"C:\\Windows\\system32\\wbem\\WMIADAP.EXE", "944"));
		this.listaDeProcessosAceitos.add(new Processo("taskkill.exe",
				"C:\\Windows\\system32\\taskkill.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"SMARTBoardService.exe",
						"C:\\Program Files (x86)\\SMART Technologies\\SMART Product Drivers\\SMARTBoardService.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"SMARTSNMPAgent.exe",
						"C:\\Program Files (x86)\\SMART Technologies\\SMART Product Drivers\\SMARTSNMPAgent.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"jusched.exe",
						"C:\\Program Files (x86)\\Common Files\\Java\\Java Update\\jusched.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"IAStorIcon.exe",
						"C:\\Program Files (x86)\\Intel\\Intel(R) Rapid Storage Technology\\IAStorIcon.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"PrivacyIconClient.exe",
						"C:\\Program Files (x86)\\Intel\\Intel(R) Management Engine Components\\IMSS\\PrivacyIconClient.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("WerFault.exe",
				"C:\\Windows\\SysWOW64\\WerFault.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"PIconStartup.exe",
						"C:\\Program Files (x86)\\Intel\\Intel(R) Management Engine Components\\IMSS\\PIconStartup.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("Dxpserver.exe",
				"C:\\Windows\\system32\\DXPServer.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"DeviceDisplayObjectProvider.exe",
						"C:\\Windows\\system32\\DeviceDisplayObjectProvider.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("Dxpserver.exe",
				"C:\\Windows\\system32\\DXPServer.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"IAStorIconLaunch.exe",
						"C:\\Program Files (x86)\\Intel\\Intel(R) Rapid Storage Technology\\IAStorIconLaunch.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("USBGuard.exe",
				"C:\\Program Files (x86)\\USB Disk Security\\USBGuard.exe",
				"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"MotoHelperAgent.exe",
						"C:\\Program Files (x86)\\Motorola Mobility\\Motorola Device Manager\\MotoHelperAgent.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"ForwardDaemon.exe",
						"C:\\Program Files (x86)\\Motorola\\MotForwardDaemon\\ForwardDaemon.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"MotoHelperService.exe",
						"C:\\Program Files (x86)\\Motorola Mobility\\Motorola Device Manager\\MotoHelperService.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("msiexec.exe",
				"C:\\Windows\\system32\\msiexec.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("reg.exe",
				"C:\\Windows\\system32\\REG.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("msdtc.exe",
				"C:\\Windows\\System32\\msdtc.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("dllhost.exe",
				"C:\\Windows\\system32\\dllhost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("rundll32.exe",
				"C:\\Windows\\SysWOW64\\rundll32.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("net.exe",
				"C:\\Windows\\system32\\net.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("net1.exe",
				"C:\\Windows\\system32\\net1.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"CmapTools.exe",
						"C:\\Program Files\\IHMC CmapTools\\bin\\CmapTools.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"javaw.exe",
						"C:\\Program Files\\IHMC CmapTools\\jre\\bin\\javaw.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"Winx64CmapTools_v6.01_02-25-15.exe",
						"\\\\LABTI36\\arquivos\\acleber\\Downloads\\Winx64CmapTools_v6.01_02-25-15.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("dinotify.exe",
				"C:\\Windows\\System32\\dinotify.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("WMIADAP.exe",
				"\\\\?\\C:\\Windows\\system32\\wbem\\WMIADAP.EXE", "944"));
		this.listaDeProcessosAceitos.add(new Processo("iexplore.exe",
				"C:\\Program Files\\Internet Explorer\\IEXPLORE.EXE", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"AcroRd32.exe",
						"C:\\Program Files (x86)\\Adobe\\Acrobat Reader DC\\Reader\\AcroRd32.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"RdrCEF.exe",
						"C:\\Program Files (x86)\\Adobe\\Acrobat Reader DC\\Reader\\AcroCEF\\RdrCEF.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"LogTransport2.exe",
						"C:\\Program Files (x86)\\Adobe\\Acrobat Reader DC\\Reader\\LogTransport2.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"RdrCEF.exe",
						"C:\\Program Files (x86)\\Adobe\\Acrobat Reader DC\\Reader\\AcroCEF\\RdrCEF.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("CCleaner64.exe",
				"C:\\Program Files\\CCleaner\\CCleaner64.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("eclipse.exe",
				"C:\\Program Files (x86)\\eclipse\\eclipse.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("MpSigStub.exe",
				"C:\\Windows\\system32\\MpSigStub.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("sdclt.exe",
				"C:\\Windows\\System32\\sdclt.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("eclipse.exe",
				"E:\\eclipse\\eclipse.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("javaw.exe",
				"C:\\Program Files (x86)\\Java\\jre1.8.0_40\\bin\\javaw.exe",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("lmgrd.exe",
				"C:\\Program Files (x86)\\ArcGIS\\License10.1\\bin\\lmgrd.exe",
				"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"ARCGIS.exe",
						"C:\\Program Files (x86)\\ArcGIS\\License10.1\\bin\\ARCGIS.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("sched.exe",
				"C:\\Program Files (x86)\\Avira\\Antivirus\\sched.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"avguard.exe",
						"C:\\Program Files (x86)\\Avira\\Antivirus\\avguard.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("avgnt.exe",
				"C:\\Program Files (x86)\\Avira\\Antivirus\\avgnt.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("avshadow.exe",
				"C:\\Program Files (x86)\\Avira\\Antivirus\\avshadow.exe",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("net.exe",
				"C:\\Windows\\SysWOW64\\net.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"AdobeARM.exe",
						"C:\\Program Files (x86)\\Common Files\\Adobe\\ARM\\1.0\\AdobeARM.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"reader_sl.exe",
						"C:\\Program Files (x86)\\Adobe\\Acrobat Reader DC\\Reader\\Reader_sl.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"AdobeARM.exe",
						"C:\\Program Files (x86)\\Common Files\\Adobe\\ARM\\1.0\\AdobeARM.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("eclipse.exe",
				"C:\\eclipse\\eclipse.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("googledrivesync.exe",
				"C:\\Program Files (x86)\\Google\\Drive\\googledrivesync.exe",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("WmiPrvSE.exe",
				"C:\\Windows\\sysWOW64\\wbem\\wmiprvse.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("javaw.exe",
				"C:\\Program Files\\Java\\jre1.8.0_40\\bin\\javaw.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("eclipse.exe",
				"C:\\Program Files (x86)\\eclipse_c\\eclipse.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"starter.exe",
						"C:\\Program Files (x86)\\eclipse_c\\plugins\\org.eclipse.cdt.core.win32.x86_64_5.3.0.201409172108\\os\\win32\\x86_64\\starter.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("gcc.exe",
				"C:\\MinGW\\bin\\gcc.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("cacls.exe",
				"C:\\Windows\\system32\\cacls.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("drvinst.exe",
				"C:\\Windows\\system32\\DrvInst.exe", "944"));

		this.listaDeProcessosAceitos.add(new Processo("makecab.exe",
				"C:\\Windows\\system32\\makecab.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("attrib.exe",
				"C:\\Windows\\system32\\attrib.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("eclipse.exe", user
				+ "\\Documents\\eclipse\\eclipse.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("eclipse.exe", user
				+ "\\Downloads\\eclipse_java\\eclipse.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("eclipse.exe", user
				+ "\\Downloads\\eclipse\\eclipse.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("Dropbox.exe", user
				+ "\\AppData\\Roaming\\Dropbox\\bin\\Dropbox.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("DrvUpdater.exe", user
				+ "\\AppData\\Roaming\\DRPSu\\DrvUpdater.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"CmapTools_v6.01_02-25-15.exe",
						user
								+ "\\AppData\\Local\\Temp\\I1434973992\\Windows\\CmapTools_v6.01_02-25-15.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"javaw.exe",
						user
								+ "\\AppData\\Local\\Temp\\I1434973992\\Windows\\resource\\jre\\bin\\javaw.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"Photoshop.exe",
						user
								+ "\\Documents\\Photoshop CS6 Portable\\AutoPlay\\Docs\\App\\PhotoshopCS6\\Photoshop.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"PhotoshopCS6Portable.exe",
						user
								+ "\\Documents\\Photoshop CS6 Portable\\AutoPlay\\Docs\\PhotoshopCS6Portable.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("eclipse.exe", user
				+ "\\Downloads\\eclipse\\eclipse.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("notepad.exe",
				"C:\\Windows\\SysWOW64\\notepad.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("eclipse.exe", user
				+ "C:\\arquivos\\jefponte\\Documents\\eclipse\\eclipse.exe",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("eclipse.exe", user
				+ "C:\\Program Files (x86)\\eclipse_php\\eclipse.exe", "944"));
		// C:\Windows\SysWOW64\notepad.exe,notepad.exe,123

		// Windows 32 bits.

		this.listaDeProcessosAceitos
				.add(new Processo(
						"TdmService.exe",
						"C:\\Program Files\\Wave Systems Corp\\Trusted Drive Manager\\TdmService.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("armsvc.exe",
				"C:\\Program Files\\Common Files\\Adobe\\ARM\\1.0\\armsvc.exe",
				"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"TeamViewer_Service.exe",
						"C:\\Program Files\\TeamViewer\\Version8\\TeamViewer_Service.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("unsecapp.exe",
				"C:\\Windows\\system32\\wbem\\unsecapp.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"OcsService.exe",
						"C:\\Program Files\\OCS Inventory Agent\\OcsService.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"IAStorDataMgrSvc.exe",
						"C:\\Program Files\\Intel\\Intel(R) Rapid Storage Technology\\IAStorDataMgrSvc.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("lms.exe",
				"C:\\Program Files\\Intel\\AMT\\LMS.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"UNS.exe",
						"C:\\Program Files\\Common Files\\Intel\\Privacy Icon\\UNS\\UNS.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"smax4pnp.exe",
						"C:\\Program Files\\Analog Devices\\Core\\smax4pnp.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"IAStorIcon.exe",
						"C:\\Program Files\\Intel\\Intel(R) Rapid Storage Technology\\IAStorIcon.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"WavXDocMgr.exe",
						"C:\\Program Files\\Wave Systems Corp\\Services Manager\\DocMgr\\bin\\WavXDocMgr.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"BcmDeviceAndTaskStatusService.exe",
						"C:\\Program Files\\Dell\\Dell ControlPoint\\Security Manager\\BcmDeviceAndTaskStatusService.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("PDVDDXSrv.exe",
				"C:\\Program Files\\CyberLink\\PowerDVD DX\\PDVDDXSrv.exe",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("wmdc.exe",
				"C:\\Windows\\WindowsMobile\\wmdc.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"OcsSystray.exe",
						"C:\\Program Files\\OCS Inventory Agent\\OcsSystray.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"TdmNotify.exe",
						"C:\\Program Files\\Wave Systems Corp\\Trusted Drive Manager\\TdmNotify.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("soffice.exe",
				"C:\\Program Files\\BrOffice.org 3\\program\\soffice.exe",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("soffice.bin",
				"C:\\Program Files\\BrOffice.org 3\\program\\soffice.bin",
				"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"PrivacyIconClient.exe",
						"C:\\Program Files\\Common Files\\Intel\\Privacy Icon\\PrivacyIconClient.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("eclipse.exe",
				"C:\\Program Files\\eclipse\\eclipse.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"SeaPort.EXE",
						"C:\\Program Files\\Microsoft\\BingBar\\7.3.132.0\\SeaPort.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("csrss.exe",
				"C:\\Windows\\system32\\csrss.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("wininit.exe",
				"C:\\Windows\\system32\\wininit.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("csrss.exe",
				"C:\\Windows\\system32\\csrss.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("winlogon.exe",
				"C:\\Windows\\system32\\winlogon.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("services.exe",
				"C:\\Windows\\system32\\services.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("lsass.exe",
				"C:\\Windows\\system32\\lsass.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("lsm.exe",
				"C:\\Windows\\system32\\lsm.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("MsMpEng.exe",
				"c:\\Program Files\\Microsoft Security Client\\MsMpEng.exe",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\System32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\System32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("spoolsv.exe",
				"C:\\Windows\\System32\\spoolsv.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"TdmService.exe",
						"C:\\Program Files\\Wave Systems Corp\\Trusted Drive Manager\\TdmService.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("armsvc.exe",
				"C:\\Program Files\\Common Files\\Adobe\\ARM\\1.0\\armsvc.exe",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("taskhost.exe",
				"C:\\Windows\\system32\\taskhost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("dwm.exe",
				"C:\\Windows\\system32\\Dwm.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\System32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"TeamViewer_Service.exe",
						"C:\\Program Files\\TeamViewer\\Version8\\TeamViewer_Service.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"WLIDSVC.EXE",
						"C:\\Program Files\\Common Files\\Microsoft Shared\\Windows Live\\WLIDSVC.EXE",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"WLIDSVCM.EXE",
						"C:\\Program Files\\Common Files\\Microsoft Shared\\Windows Live\\WLIDSvcM.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("unsecapp.exe",
				"C:\\Windows\\system32\\wbem\\unsecapp.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("WmiPrvSE.exe",
				"C:\\Windows\\system32\\wbem\\wmiprvse.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("NisSrv.exe",
				"c:\\Program Files\\Microsoft Security Client\\NisSrv.exe",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"smax4pnp.exe",
						"C:\\Program Files\\Analog Devices\\Core\\smax4pnp.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"IAStorIcon.exe",
						"C:\\Program Files\\Intel\\Intel(R) Rapid Storage Technology\\IAStorIcon.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"WavXDocMgr.exe",
						"C:\\Program Files\\Wave Systems Corp\\Services Manager\\DocMgr\\bin\\WavXDocMgr.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"BcmDeviceAndTaskStatusService.exe",
						"C:\\Program Files\\Dell\\Dell ControlPoint\\Security Manager\\BcmDeviceAndTaskStatusService.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("PDVDDXSrv.exe",
				"C:\\Program Files\\CyberLink\\PowerDVD DX\\PDVDDXSrv.exe",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("igfxtray.exe",
				"C:\\Windows\\System32\\igfxtray.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("hkcmd.exe",
				"C:\\Windows\\System32\\hkcmd.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("igfxpers.exe",
				"C:\\Windows\\System32\\igfxpers.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("msseces.exe",
				"C:\\Program Files\\Microsoft Security Client\\msseces.exe",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("wmdc.exe",
				"C:\\Windows\\WindowsMobile\\wmdc.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"TdmNotify.exe",
						"C:\\Program Files\\Wave Systems Corp\\Trusted Drive Manager\\TdmNotify.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("SearchIndexer.exe",
				"C:\\Windows\\system32\\SearchIndexer.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"PrivacyIconClient.exe",
						"C:\\Program Files\\Common Files\\Intel\\Privacy Icon\\PrivacyIconClient.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"OcsService.exe",
						"C:\\Program Files\\OCS Inventory Agent\\OcsService.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"IAStorDataMgrSvc.exe",
						"C:\\Program Files\\Intel\\Intel(R) Rapid Storage Technology\\IAStorDataMgrSvc.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("lms.exe",
				"C:\\Program Files\\Intel\\AMT\\LMS.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"UNS.exe",
						"C:\\Program Files\\Common Files\\Intel\\Privacy Icon\\UNS\\UNS.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("wuauclt.exe",
				"C:\\Windows\\system32\\wuauclt.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"SeaPort.EXE",
						"C:\\Program Files\\Microsoft\\BingBar\\7.3.132.0\\SeaPort.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("WUDFHost.exe",
				"C:\\Windows\\System32\\WUDFHost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("cmd.exe",
				"C:\\Windows\\system32\\cmd.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("conhost.exe",
				"C:\\Windows\\system32\\conhost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("java.exe",
				"C:\\Windows\\system32\\java.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("SearchProtocolHost.exe",
				"C:\\Windows\\system32\\SearchProtocolHost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("SearchFilterHost.exe",
				"C:\\Windows\\system32\\SearchFilterHost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("explorer.exe",
				"C:\\Windows\\explorer.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("igfxsrvc.exe",
				"C:\\Windows\\system32\\igfxsrvc.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("csrss.exe",
				"C:\\Windows\\system32\\csrss.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("wininit.exe",
				"C:\\Windows\\system32\\wininit.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("csrss.exe",
				"C:\\Windows\\system32\\csrss.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("winlogon.exe",
				"C:\\Windows\\system32\\winlogon.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("services.exe",
				"C:\\Windows\\system32\\services.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("lsass.exe",
				"C:\\Windows\\system32\\lsass.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("lsm.exe",
				"C:\\Windows\\system32\\lsm.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("MsMpEng.exe",
				"c:\\Program Files\\Microsoft Security Client\\MsMpEng.exe",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\System32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\System32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("spoolsv.exe",
				"C:\\Windows\\System32\\spoolsv.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"TdmService.exe",
						"C:\\Program Files\\Wave Systems Corp\\Trusted Drive Manager\\TdmService.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("armsvc.exe",
				"C:\\Program Files\\Common Files\\Adobe\\ARM\\1.0\\armsvc.exe",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("taskhost.exe",
				"C:\\Windows\\system32\\taskhost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("dwm.exe",
				"C:\\Windows\\system32\\Dwm.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\System32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"TeamViewer_Service.exe",
						"C:\\Program Files\\TeamViewer\\Version8\\TeamViewer_Service.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"WLIDSVC.EXE",
						"C:\\Program Files\\Common Files\\Microsoft Shared\\Windows Live\\WLIDSVC.EXE",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"WLIDSVCM.EXE",
						"C:\\Program Files\\Common Files\\Microsoft Shared\\Windows Live\\WLIDSvcM.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("unsecapp.exe",
				"C:\\Windows\\system32\\wbem\\unsecapp.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("WmiPrvSE.exe",
				"C:\\Windows\\system32\\wbem\\wmiprvse.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("NisSrv.exe",
				"c:\\Program Files\\Microsoft Security Client\\NisSrv.exe",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"smax4pnp.exe",
						"C:\\Program Files\\Analog Devices\\Core\\smax4pnp.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"IAStorIcon.exe",
						"C:\\Program Files\\Intel\\Intel(R) Rapid Storage Technology\\IAStorIcon.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"WavXDocMgr.exe",
						"C:\\Program Files\\Wave Systems Corp\\Services Manager\\DocMgr\\bin\\WavXDocMgr.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"BcmDeviceAndTaskStatusService.exe",
						"C:\\Program Files\\Dell\\Dell ControlPoint\\Security Manager\\BcmDeviceAndTaskStatusService.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("PDVDDXSrv.exe",
				"C:\\Program Files\\CyberLink\\PowerDVD DX\\PDVDDXSrv.exe",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("igfxtray.exe",
				"C:\\Windows\\System32\\igfxtray.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("hkcmd.exe",
				"C:\\Windows\\System32\\hkcmd.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("igfxpers.exe",
				"C:\\Windows\\System32\\igfxpers.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("msseces.exe",
				"C:\\Program Files\\Microsoft Security Client\\msseces.exe",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("wmdc.exe",
				"C:\\Windows\\WindowsMobile\\wmdc.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"TdmNotify.exe",
						"C:\\Program Files\\Wave Systems Corp\\Trusted Drive Manager\\TdmNotify.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("SearchIndexer.exe",
				"C:\\Windows\\system32\\SearchIndexer.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"PrivacyIconClient.exe",
						"C:\\Program Files\\Common Files\\Intel\\Privacy Icon\\PrivacyIconClient.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"OcsService.exe",
						"C:\\Program Files\\OCS Inventory Agent\\OcsService.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"IAStorDataMgrSvc.exe",
						"C:\\Program Files\\Intel\\Intel(R) Rapid Storage Technology\\IAStorDataMgrSvc.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("lms.exe", "C:\\Program Files\\Intel\\AMT\\LMS.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"UNS.exe",
						"C:\\Program Files\\Common Files\\Intel\\Privacy Icon\\UNS\\UNS.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("wuauclt.exe",
				"C:\\Windows\\system32\\wuauclt.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"SeaPort.EXE",
						"C:\\Program Files\\Microsoft\\BingBar\\7.3.132.0\\SeaPort.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("WUDFHost.exe",
				"C:\\Windows\\System32\\WUDFHost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("cmd.exe",
				"C:\\Windows\\system32\\cmd.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("conhost.exe",
				"C:\\Windows\\system32\\conhost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("java.exe",
				"C:\\Windows\\system32\\java.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("SearchProtocolHost.exe",
				"C:\\Windows\\system32\\SearchProtocolHost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("SearchFilterHost.exe",
				"C:\\Windows\\system32\\SearchFilterHost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("explorer.exe",
				"C:\\Windows\\explorer.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("igfxsrvc.exe",
				"C:\\Windows\\system32\\igfxsrvc.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("WMIC.exe",
				"C:\\Windows\\System32\\Wbem\\wmic.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("csrss.exe",
				"C:\\Windows\\system32\\csrss.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("wininit.exe",
				"C:\\Windows\\system32\\wininit.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("csrss.exe",
				"C:\\Windows\\system32\\csrss.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("winlogon.exe",
				"C:\\Windows\\system32\\winlogon.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("services.exe",
				"C:\\Windows\\system32\\services.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("lsass.exe",
				"C:\\Windows\\system32\\lsass.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("lsm.exe",
				"C:\\Windows\\system32\\lsm.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("MsMpEng.exe",
				"c:\\Program Files\\Microsoft Security Client\\MsMpEng.exe",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\System32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\System32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("spoolsv.exe",
				"C:\\Windows\\System32\\spoolsv.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"TdmService.exe",
						"C:\\Program Files\\Wave Systems Corp\\Trusted Drive Manager\\TdmService.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("armsvc.exe",
				"C:\\Program Files\\Common Files\\Adobe\\ARM\\1.0\\armsvc.exe",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("taskhost.exe",
				"C:\\Windows\\system32\\taskhost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("dwm.exe",
				"C:\\Windows\\system32\\Dwm.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\System32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"TeamViewer_Service.exe",
						"C:\\Program Files\\TeamViewer\\Version8\\TeamViewer_Service.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"WLIDSVC.EXE",
						"C:\\Program Files\\Common Files\\Microsoft Shared\\Windows Live\\WLIDSVC.EXE",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"WLIDSVCM.EXE",
						"C:\\Program Files\\Common Files\\Microsoft Shared\\Windows Live\\WLIDSvcM.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("unsecapp.exe",
				"C:\\Windows\\system32\\wbem\\unsecapp.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("WmiPrvSE.exe",
				"C:\\Windows\\system32\\wbem\\wmiprvse.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("NisSrv.exe",
				"c:\\Program Files\\Microsoft Security Client\\NisSrv.exe",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"smax4pnp.exe",
						"C:\\Program Files\\Analog Devices\\Core\\smax4pnp.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"IAStorIcon.exe",
						"C:\\Program Files\\Intel\\Intel(R) Rapid Storage Technology\\IAStorIcon.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"WavXDocMgr.exe",
						"C:\\Program Files\\Wave Systems Corp\\Services Manager\\DocMgr\\bin\\WavXDocMgr.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"BcmDeviceAndTaskStatusService.exe",
						"C:\\Program Files\\Dell\\Dell ControlPoint\\Security Manager\\BcmDeviceAndTaskStatusService.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("PDVDDXSrv.exe",
				"C:\\Program Files\\CyberLink\\PowerDVD DX\\PDVDDXSrv.exe",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("igfxtray.exe",
				"C:\\Windows\\System32\\igfxtray.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("hkcmd.exe",
				"C:\\Windows\\System32\\hkcmd.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("igfxpers.exe",
				"C:\\Windows\\System32\\igfxpers.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("msseces.exe",
				"C:\\Program Files\\Microsoft Security Client\\msseces.exe",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("wmdc.exe",
				"C:\\Windows\\WindowsMobile\\wmdc.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"TdmNotify.exe",
						"C:\\Program Files\\Wave Systems Corp\\Trusted Drive Manager\\TdmNotify.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("SearchIndexer.exe",
				"C:\\Windows\\system32\\SearchIndexer.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"PrivacyIconClient.exe",
						"C:\\Program Files\\Common Files\\Intel\\Privacy Icon\\PrivacyIconClient.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"OcsService.exe",
						"C:\\Program Files\\OCS Inventory Agent\\OcsService.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"IAStorDataMgrSvc.exe",
						"C:\\Program Files\\Intel\\Intel(R) Rapid Storage Technology\\IAStorDataMgrSvc.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("lms.exe",
				"C:\\Program Files\\Intel\\AMT\\LMS.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"UNS.exe",
						"C:\\Program Files\\Common Files\\Intel\\Privacy Icon\\UNS\\UNS.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("wuauclt.exe",
				"C:\\Windows\\system32\\wuauclt.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"SeaPort.EXE",
						"C:\\Program Files\\Microsoft\\BingBar\\7.3.132.0\\SeaPort.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("WUDFHost.exe",
				"C:\\Windows\\System32\\WUDFHost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("cmd.exe",
				"C:\\Windows\\system32\\cmd.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("conhost.exe",
				"C:\\Windows\\system32\\conhost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("java.exe",
				"C:\\Windows\\system32\\java.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("SearchProtocolHost.exe",
				"C:\\Windows\\system32\\SearchProtocolHost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("SearchFilterHost.exe",
				"C:\\Windows\\system32\\SearchFilterHost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("explorer.exe",
				"C:\\Windows\\explorer.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("igfxsrvc.exe",
				"C:\\Windows\\system32\\igfxsrvc.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("WMIC.exe",
				"C:\\Windows\\System32\\Wbem\\wmic.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("csrss.exe",
				"C:\\Windows\\system32\\csrss.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("wininit.exe",
				"C:\\Windows\\system32\\wininit.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("csrss.exe",
				"C:\\Windows\\system32\\csrss.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("winlogon.exe",
				"C:\\Windows\\system32\\winlogon.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("services.exe",
				"C:\\Windows\\system32\\services.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("lsass.exe",
				"C:\\Windows\\system32\\lsass.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("lsm.exe",
				"C:\\Windows\\system32\\lsm.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("MsMpEng.exe",
				"c:\\Program Files\\Microsoft Security Client\\MsMpEng.exe",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\System32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\System32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("spoolsv.exe",
				"C:\\Windows\\System32\\spoolsv.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"TdmService.exe",
						"C:\\Program Files\\Wave Systems Corp\\Trusted Drive Manager\\TdmService.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("armsvc.exe",
				"C:\\Program Files\\Common Files\\Adobe\\ARM\\1.0\\armsvc.exe",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("taskhost.exe",
				"C:\\Windows\\system32\\taskhost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("dwm.exe",
				"C:\\Windows\\system32\\Dwm.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\System32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"TeamViewer_Service.exe",
						"C:\\Program Files\\TeamViewer\\Version8\\TeamViewer_Service.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"WLIDSVC.EXE",
						"C:\\Program Files\\Common Files\\Microsoft Shared\\Windows Live\\WLIDSVC.EXE",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"WLIDSVCM.EXE",
						"C:\\Program Files\\Common Files\\Microsoft Shared\\Windows Live\\WLIDSvcM.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("unsecapp.exe",
				"C:\\Windows\\system32\\wbem\\unsecapp.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("WmiPrvSE.exe",
				"C:\\Windows\\system32\\wbem\\wmiprvse.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("NisSrv.exe",
				"c:\\Program Files\\Microsoft Security Client\\NisSrv.exe",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"smax4pnp.exe",
						"C:\\Program Files\\Analog Devices\\Core\\smax4pnp.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"IAStorIcon.exe",
						"C:\\Program Files\\Intel\\Intel(R) Rapid Storage Technology\\IAStorIcon.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"WavXDocMgr.exe",
						"C:\\Program Files\\Wave Systems Corp\\Services Manager\\DocMgr\\bin\\WavXDocMgr.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"BcmDeviceAndTaskStatusService.exe",
						"C:\\Program Files\\Dell\\Dell ControlPoint\\Security Manager\\BcmDeviceAndTaskStatusService.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("PDVDDXSrv.exe",
				"C:\\Program Files\\CyberLink\\PowerDVD DX\\PDVDDXSrv.exe",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("igfxtray.exe",
				"C:\\Windows\\System32\\igfxtray.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("hkcmd.exe",
				"C:\\Windows\\System32\\hkcmd.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("igfxpers.exe",
				"C:\\Windows\\System32\\igfxpers.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("msseces.exe",
				"C:\\Program Files\\Microsoft Security Client\\msseces.exe",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("wmdc.exe",
				"C:\\Windows\\WindowsMobile\\wmdc.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"TdmNotify.exe",
						"C:\\Program Files\\Wave Systems Corp\\Trusted Drive Manager\\TdmNotify.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("SearchIndexer.exe",
				"C:\\Windows\\system32\\SearchIndexer.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"PrivacyIconClient.exe",
						"C:\\Program Files\\Common Files\\Intel\\Privacy Icon\\PrivacyIconClient.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"OcsService.exe",
						"C:\\Program Files\\OCS Inventory Agent\\OcsService.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"IAStorDataMgrSvc.exe",
						"C:\\Program Files\\Intel\\Intel(R) Rapid Storage Technology\\IAStorDataMgrSvc.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("lms.exe",
				"C:\\Program Files\\Intel\\AMT\\LMS.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"UNS.exe",
						"C:\\Program Files\\Common Files\\Intel\\Privacy Icon\\UNS\\UNS.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("wuauclt.exe",
				"C:\\Windows\\system32\\wuauclt.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"SeaPort.EXE",
						"C:\\Program Files\\Microsoft\\BingBar\\7.3.132.0\\SeaPort.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("WUDFHost.exe",
				"C:\\Windows\\System32\\WUDFHost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("cmd.exe",
				"C:\\Windows\\system32\\cmd.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("conhost.exe",
				"C:\\Windows\\system32\\conhost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("java.exe",
				"C:\\Windows\\system32\\java.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("SearchProtocolHost.exe",
				"C:\\Windows\\system32\\SearchProtocolHost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("SearchFilterHost.exe",
				"C:\\Windows\\system32\\SearchFilterHost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("explorer.exe",
				"C:\\Windows\\explorer.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("igfxsrvc.exe",
				"C:\\Windows\\system32\\igfxsrvc.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("WMIC.exe",
				"C:\\Windows\\System32\\Wbem\\wmic.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("csrss.exe",
				"C:\\Windows\\system32\\csrss.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("wininit.exe",
				"C:\\Windows\\system32\\wininit.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("csrss.exe",
				"C:\\Windows\\system32\\csrss.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("winlogon.exe",
				"C:\\Windows\\system32\\winlogon.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("services.exe",
				"C:\\Windows\\system32\\services.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("lsass.exe",
				"C:\\Windows\\system32\\lsass.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("lsm.exe",
				"C:\\Windows\\system32\\lsm.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("MsMpEng.exe",
				"c:\\Program Files\\Microsoft Security Client\\MsMpEng.exe",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\System32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\System32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("spoolsv.exe",
				"C:\\Windows\\System32\\spoolsv.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"TdmService.exe",
						"C:\\Program Files\\Wave Systems Corp\\Trusted Drive Manager\\TdmService.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("armsvc.exe",
				"C:\\Program Files\\Common Files\\Adobe\\ARM\\1.0\\armsvc.exe",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("taskhost.exe",
				"C:\\Windows\\system32\\taskhost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("dwm.exe",
				"C:\\Windows\\system32\\Dwm.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\System32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"TeamViewer_Service.exe",
						"C:\\Program Files\\TeamViewer\\Version8\\TeamViewer_Service.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"WLIDSVC.EXE",
						"C:\\Program Files\\Common Files\\Microsoft Shared\\Windows Live\\WLIDSVC.EXE",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"WLIDSVCM.EXE",
						"C:\\Program Files\\Common Files\\Microsoft Shared\\Windows Live\\WLIDSvcM.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("unsecapp.exe",
				"C:\\Windows\\system32\\wbem\\unsecapp.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("WmiPrvSE.exe",
				"C:\\Windows\\system32\\wbem\\wmiprvse.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("NisSrv.exe",
				"c:\\Program Files\\Microsoft Security Client\\NisSrv.exe",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"smax4pnp.exe",
						"C:\\Program Files\\Analog Devices\\Core\\smax4pnp.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"IAStorIcon.exe",
						"C:\\Program Files\\Intel\\Intel(R) Rapid Storage Technology\\IAStorIcon.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"WavXDocMgr.exe",
						"C:\\Program Files\\Wave Systems Corp\\Services Manager\\DocMgr\\bin\\WavXDocMgr.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"BcmDeviceAndTaskStatusService.exe",
						"C:\\Program Files\\Dell\\Dell ControlPoint\\Security Manager\\BcmDeviceAndTaskStatusService.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("PDVDDXSrv.exe",
				"C:\\Program Files\\CyberLink\\PowerDVD DX\\PDVDDXSrv.exe",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("igfxtray.exe",
				"C:\\Windows\\System32\\igfxtray.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("hkcmd.exe",
				"C:\\Windows\\System32\\hkcmd.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("igfxpers.exe",
				"C:\\Windows\\System32\\igfxpers.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("msseces.exe",
				"C:\\Program Files\\Microsoft Security Client\\msseces.exe",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("wmdc.exe",
				"C:\\Windows\\WindowsMobile\\wmdc.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"TdmNotify.exe",
						"C:\\Program Files\\Wave Systems Corp\\Trusted Drive Manager\\TdmNotify.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("SearchIndexer.exe",
				"C:\\Windows\\system32\\SearchIndexer.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"PrivacyIconClient.exe",
						"C:\\Program Files\\Common Files\\Intel\\Privacy Icon\\PrivacyIconClient.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"OcsService.exe",
						"C:\\Program Files\\OCS Inventory Agent\\OcsService.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"IAStorDataMgrSvc.exe",
						"C:\\Program Files\\Intel\\Intel(R) Rapid Storage Technology\\IAStorDataMgrSvc.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("lms.exe",
				"C:\\Program Files\\Intel\\AMT\\LMS.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"UNS.exe",
						"C:\\Program Files\\Common Files\\Intel\\Privacy Icon\\UNS\\UNS.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("wuauclt.exe",
				"C:\\Windows\\system32\\wuauclt.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"SeaPort.EXE",
						"C:\\Program Files\\Microsoft\\BingBar\\7.3.132.0\\SeaPort.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("cmd.exe",
				"C:\\Windows\\system32\\cmd.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("conhost.exe",
				"C:\\Windows\\system32\\conhost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("WUDFHost.exe",
				"C:\\Windows\\System32\\WUDFHost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("java.exe",
				"C:\\Windows\\system32\\java.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("SearchProtocolHost.exe",
				"C:\\Windows\\system32\\SearchProtocolHost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("SearchFilterHost.exe",
				"C:\\Windows\\system32\\SearchFilterHost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("explorer.exe",
				"C:\\Windows\\explorer.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("igfxsrvc.exe",
				"C:\\Windows\\system32\\igfxsrvc.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("WMIC.exe",
				"C:\\Windows\\System32\\Wbem\\wmic.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("csrss.exe",
				"C:\\Windows\\system32\\csrss.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("wininit.exe",
				"C:\\Windows\\system32\\wininit.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("csrss.exe",
				"C:\\Windows\\system32\\csrss.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("winlogon.exe",
				"C:\\Windows\\system32\\winlogon.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("services.exe",
				"C:\\Windows\\system32\\services.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("lsass.exe",
				"C:\\Windows\\system32\\lsass.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("lsm.exe",
				"C:\\Windows\\system32\\lsm.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("MsMpEng.exe",
				"c:\\Program Files\\Microsoft Security Client\\MsMpEng.exe",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\System32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\System32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("spoolsv.exe",
				"C:\\Windows\\System32\\spoolsv.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"TdmService.exe",
						"C:\\Program Files\\Wave Systems Corp\\Trusted Drive Manager\\TdmService.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("armsvc.exe",
				"C:\\Program Files\\Common Files\\Adobe\\ARM\\1.0\\armsvc.exe",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("taskhost.exe",
				"C:\\Windows\\system32\\taskhost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("dwm.exe",
				"C:\\Windows\\system32\\Dwm.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\System32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"TeamViewer_Service.exe",
						"C:\\Program Files\\TeamViewer\\Version8\\TeamViewer_Service.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"WLIDSVC.EXE",
						"C:\\Program Files\\Common Files\\Microsoft Shared\\Windows Live\\WLIDSVC.EXE",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"WLIDSVCM.EXE",
						"C:\\Program Files\\Common Files\\Microsoft Shared\\Windows Live\\WLIDSvcM.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("unsecapp.exe",
				"C:\\Windows\\system32\\wbem\\unsecapp.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("WmiPrvSE.exe",
				"C:\\Windows\\system32\\wbem\\wmiprvse.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("NisSrv.exe",
				"c:\\Program Files\\Microsoft Security Client\\NisSrv.exe",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"smax4pnp.exe",
						"C:\\Program Files\\Analog Devices\\Core\\smax4pnp.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"IAStorIcon.exe",
						"C:\\Program Files\\Intel\\Intel(R) Rapid Storage Technology\\IAStorIcon.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"WavXDocMgr.exe",
						"C:\\Program Files\\Wave Systems Corp\\Services Manager\\DocMgr\\bin\\WavXDocMgr.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"BcmDeviceAndTaskStatusService.exe",
						"C:\\Program Files\\Dell\\Dell ControlPoint\\Security Manager\\BcmDeviceAndTaskStatusService.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("PDVDDXSrv.exe",
				"C:\\Program Files\\CyberLink\\PowerDVD DX\\PDVDDXSrv.exe",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("igfxtray.exe",
				"C:\\Windows\\System32\\igfxtray.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("hkcmd.exe",
				"C:\\Windows\\System32\\hkcmd.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("igfxpers.exe",
				"C:\\Windows\\System32\\igfxpers.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("msseces.exe",
				"C:\\Program Files\\Microsoft Security Client\\msseces.exe",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("wmdc.exe",
				"C:\\Windows\\WindowsMobile\\wmdc.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"TdmNotify.exe",
						"C:\\Program Files\\Wave Systems Corp\\Trusted Drive Manager\\TdmNotify.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("SearchIndexer.exe",
				"C:\\Windows\\system32\\SearchIndexer.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"PrivacyIconClient.exe",
						"C:\\Program Files\\Common Files\\Intel\\Privacy Icon\\PrivacyIconClient.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"OcsService.exe",
						"C:\\Program Files\\OCS Inventory Agent\\OcsService.exe",
						"944"));
		
		this.listaDeProcessosAceitos.add(new Processo("POWERPNT.EXE", "C:\\Program Files (x86)\\Microsoft Office\\Office15\\POWERPNT.EXE", "944"));
		
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"IAStorDataMgrSvc.exe",
						"C:\\Program Files\\Intel\\Intel(R) Rapid Storage Technology\\IAStorDataMgrSvc.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("lms.exe",
				"C:\\Program Files\\Intel\\AMT\\LMS.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"UNS.exe",
						"C:\\Program Files\\Common Files\\Intel\\Privacy Icon\\UNS\\UNS.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("wuauclt.exe",
				"C:\\Windows\\system32\\wuauclt.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"SeaPort.EXE",
						"C:\\Program Files\\Microsoft\\BingBar\\7.3.132.0\\SeaPort.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("cmd.exe",
				"C:\\Windows\\system32\\cmd.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("conhost.exe",
				"C:\\Windows\\system32\\conhost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("WUDFHost.exe",
				"C:\\Windows\\System32\\WUDFHost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("java.exe",
				"C:\\Windows\\system32\\java.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("SearchProtocolHost.exe",
				"C:\\Windows\\system32\\SearchProtocolHost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("SearchFilterHost.exe",
				"C:\\Windows\\system32\\SearchFilterHost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("explorer.exe",
				"C:\\Windows\\explorer.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("igfxsrvc.exe",
				"C:\\Windows\\system32\\igfxsrvc.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("WMIC.exe",
				"C:\\Windows\\System32\\Wbem\\wmic.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("csrss.exe",
				"C:\\Windows\\system32\\csrss.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("wininit.exe",
				"C:\\Windows\\system32\\wininit.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("csrss.exe",
				"C:\\Windows\\system32\\csrss.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("winlogon.exe",
				"C:\\Windows\\system32\\winlogon.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("services.exe",
				"C:\\Windows\\system32\\services.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("lsass.exe",
				"C:\\Windows\\system32\\lsass.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("lsm.exe",
				"C:\\Windows\\system32\\lsm.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("MsMpEng.exe",
				"c:\\Program Files\\Microsoft Security Client\\MsMpEng.exe",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\System32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\System32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("spoolsv.exe",
				"C:\\Windows\\System32\\spoolsv.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"TdmService.exe",
						"C:\\Program Files\\Wave Systems Corp\\Trusted Drive Manager\\TdmService.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("armsvc.exe",
				"C:\\Program Files\\Common Files\\Adobe\\ARM\\1.0\\armsvc.exe",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("taskhost.exe",
				"C:\\Windows\\system32\\taskhost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("dwm.exe",
				"C:\\Windows\\system32\\Dwm.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\System32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"TeamViewer_Service.exe",
						"C:\\Program Files\\TeamViewer\\Version8\\TeamViewer_Service.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"WLIDSVC.EXE",
						"C:\\Program Files\\Common Files\\Microsoft Shared\\Windows Live\\WLIDSVC.EXE",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"WLIDSVCM.EXE",
						"C:\\Program Files\\Common Files\\Microsoft Shared\\Windows Live\\WLIDSvcM.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("unsecapp.exe",
				"C:\\Windows\\system32\\wbem\\unsecapp.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("WmiPrvSE.exe",
				"C:\\Windows\\system32\\wbem\\wmiprvse.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("NisSrv.exe",
				"c:\\Program Files\\Microsoft Security Client\\NisSrv.exe",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"smax4pnp.exe",
						"C:\\Program Files\\Analog Devices\\Core\\smax4pnp.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"IAStorIcon.exe",
						"C:\\Program Files\\Intel\\Intel(R) Rapid Storage Technology\\IAStorIcon.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"WavXDocMgr.exe",
						"C:\\Program Files\\Wave Systems Corp\\Services Manager\\DocMgr\\bin\\WavXDocMgr.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"BcmDeviceAndTaskStatusService.exe",
						"C:\\Program Files\\Dell\\Dell ControlPoint\\Security Manager\\BcmDeviceAndTaskStatusService.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("PDVDDXSrv.exe",
				"C:\\Program Files\\CyberLink\\PowerDVD DX\\PDVDDXSrv.exe",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("igfxtray.exe",
				"C:\\Windows\\System32\\igfxtray.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("hkcmd.exe",
				"C:\\Windows\\System32\\hkcmd.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("igfxpers.exe",
				"C:\\Windows\\System32\\igfxpers.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("msseces.exe",
				"C:\\Program Files\\Microsoft Security Client\\msseces.exe",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("wmdc.exe",
				"C:\\Windows\\WindowsMobile\\wmdc.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"TdmNotify.exe",
						"C:\\Program Files\\Wave Systems Corp\\Trusted Drive Manager\\TdmNotify.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("SearchIndexer.exe",
				"C:\\Windows\\system32\\SearchIndexer.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"PrivacyIconClient.exe",
						"C:\\Program Files\\Common Files\\Intel\\Privacy Icon\\PrivacyIconClient.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"OcsService.exe",
						"C:\\Program Files\\OCS Inventory Agent\\OcsService.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"IAStorDataMgrSvc.exe",
						"C:\\Program Files\\Intel\\Intel(R) Rapid Storage Technology\\IAStorDataMgrSvc.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("lms.exe",
				"C:\\Program Files\\Intel\\AMT\\LMS.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"UNS.exe",
						"C:\\Program Files\\Common Files\\Intel\\Privacy Icon\\UNS\\UNS.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("wuauclt.exe",
				"C:\\Windows\\system32\\wuauclt.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"SeaPort.EXE",
						"C:\\Program Files\\Microsoft\\BingBar\\7.3.132.0\\SeaPort.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("cmd.exe",
				"C:\\Windows\\system32\\cmd.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("conhost.exe",
				"C:\\Windows\\system32\\conhost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("WUDFHost.exe",
				"C:\\Windows\\System32\\WUDFHost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("java.exe",
				"C:\\Windows\\system32\\java.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("SearchProtocolHost.exe",
				"C:\\Windows\\system32\\SearchProtocolHost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("SearchFilterHost.exe",
				"C:\\Windows\\system32\\SearchFilterHost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("explorer.exe",
				"C:\\Windows\\explorer.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("WMIC.exe",
				"C:\\Windows\\System32\\Wbem\\wmic.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("csrss.exe",
				"C:\\Windows\\system32\\csrss.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("wininit.exe",
				"C:\\Windows\\system32\\wininit.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("csrss.exe",
				"C:\\Windows\\system32\\csrss.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("winlogon.exe",
				"C:\\Windows\\system32\\winlogon.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("services.exe",
				"C:\\Windows\\system32\\services.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("lsass.exe",
				"C:\\Windows\\system32\\lsass.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("lsm.exe",
				"C:\\Windows\\system32\\lsm.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("MsMpEng.exe",
				"c:\\Program Files\\Microsoft Security Client\\MsMpEng.exe",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\System32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\System32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("spoolsv.exe",
				"C:\\Windows\\System32\\spoolsv.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"TdmService.exe",
						"C:\\Program Files\\Wave Systems Corp\\Trusted Drive Manager\\TdmService.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("armsvc.exe",
				"C:\\Program Files\\Common Files\\Adobe\\ARM\\1.0\\armsvc.exe",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("taskhost.exe",
				"C:\\Windows\\system32\\taskhost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("dwm.exe",
				"C:\\Windows\\system32\\Dwm.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\System32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"TeamViewer_Service.exe",
						"C:\\Program Files\\TeamViewer\\Version8\\TeamViewer_Service.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"WLIDSVC.EXE",
						"C:\\Program Files\\Common Files\\Microsoft Shared\\Windows Live\\WLIDSVC.EXE",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"WLIDSVCM.EXE",
						"C:\\Program Files\\Common Files\\Microsoft Shared\\Windows Live\\WLIDSvcM.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("unsecapp.exe",
				"C:\\Windows\\system32\\wbem\\unsecapp.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("WmiPrvSE.exe",
				"C:\\Windows\\system32\\wbem\\wmiprvse.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("NisSrv.exe",
				"c:\\Program Files\\Microsoft Security Client\\NisSrv.exe",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"smax4pnp.exe",
						"C:\\Program Files\\Analog Devices\\Core\\smax4pnp.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"IAStorIcon.exe",
						"C:\\Program Files\\Intel\\Intel(R) Rapid Storage Technology\\IAStorIcon.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"WavXDocMgr.exe",
						"C:\\Program Files\\Wave Systems Corp\\Services Manager\\DocMgr\\bin\\WavXDocMgr.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"BcmDeviceAndTaskStatusService.exe",
						"C:\\Program Files\\Dell\\Dell ControlPoint\\Security Manager\\BcmDeviceAndTaskStatusService.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("PDVDDXSrv.exe",
				"C:\\Program Files\\CyberLink\\PowerDVD DX\\PDVDDXSrv.exe",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("igfxtray.exe",
				"C:\\Windows\\System32\\igfxtray.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("hkcmd.exe",
				"C:\\Windows\\System32\\hkcmd.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("igfxpers.exe",
				"C:\\Windows\\System32\\igfxpers.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("msseces.exe",
				"C:\\Program Files\\Microsoft Security Client\\msseces.exe",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("wmdc.exe",
				"C:\\Windows\\WindowsMobile\\wmdc.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"TdmNotify.exe",
						"C:\\Program Files\\Wave Systems Corp\\Trusted Drive Manager\\TdmNotify.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("SearchIndexer.exe",
				"C:\\Windows\\system32\\SearchIndexer.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"PrivacyIconClient.exe",
						"C:\\Program Files\\Common Files\\Intel\\Privacy Icon\\PrivacyIconClient.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"OcsService.exe",
						"C:\\Program Files\\OCS Inventory Agent\\OcsService.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"IAStorDataMgrSvc.exe",
						"C:\\Program Files\\Intel\\Intel(R) Rapid Storage Technology\\IAStorDataMgrSvc.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("lms.exe",
				"C:\\Program Files\\Intel\\AMT\\LMS.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo("UNS.exe","C:\\Program Files\\Common Files\\Intel\\Privacy Icon\\UNS\\UNS.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("wuauclt.exe","C:\\Windows\\system32\\wuauclt.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("SeaPort.EXE","C:\\Program Files\\Microsoft\\BingBar\\7.3.132.0\\SeaPort.exe","944"));
		this.listaDeProcessosAceitos.add(new Processo("cmd.exe",
				"C:\\Windows\\system32\\cmd.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("conhost.exe",
				"C:\\Windows\\system32\\conhost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("WUDFHost.exe",
				"C:\\Windows\\System32\\WUDFHost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("java.exe",
				"C:\\Windows\\system32\\java.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("SearchProtocolHost.exe",
				"C:\\Windows\\system32\\SearchProtocolHost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("SearchFilterHost.exe",
				"C:\\Windows\\system32\\SearchFilterHost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("explorer.exe",
				"C:\\Windows\\explorer.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("SearchProtocolHost.exe",
				"C:\\Windows\\system32\\SearchProtocolHost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("WMIC.exe",
				"C:\\Windows\\System32\\Wbem\\wmic.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("csrss.exe",
				"C:\\Windows\\system32\\csrss.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("wininit.exe",
				"C:\\Windows\\system32\\wininit.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("csrss.exe",
				"C:\\Windows\\system32\\csrss.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("winlogon.exe",
				"C:\\Windows\\system32\\winlogon.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("services.exe",
				"C:\\Windows\\system32\\services.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("lsass.exe",
				"C:\\Windows\\system32\\lsass.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("lsm.exe",
				"C:\\Windows\\system32\\lsm.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("MsMpEng.exe",
				"c:\\Program Files\\Microsoft Security Client\\MsMpEng.exe",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\System32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\System32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("spoolsv.exe",
				"C:\\Windows\\System32\\spoolsv.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"TdmService.exe",
						"C:\\Program Files\\Wave Systems Corp\\Trusted Drive Manager\\TdmService.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("armsvc.exe",
				"C:\\Program Files\\Common Files\\Adobe\\ARM\\1.0\\armsvc.exe",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("taskhost.exe",
				"C:\\Windows\\system32\\taskhost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("dwm.exe",
				"C:\\Windows\\system32\\Dwm.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\System32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"TeamViewer_Service.exe",
						"C:\\Program Files\\TeamViewer\\Version8\\TeamViewer_Service.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"WLIDSVC.EXE",
						"C:\\Program Files\\Common Files\\Microsoft Shared\\Windows Live\\WLIDSVC.EXE",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"WLIDSVCM.EXE",
						"C:\\Program Files\\Common Files\\Microsoft Shared\\Windows Live\\WLIDSvcM.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("unsecapp.exe",
				"C:\\Windows\\system32\\wbem\\unsecapp.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("WmiPrvSE.exe",
				"C:\\Windows\\system32\\wbem\\wmiprvse.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("NisSrv.exe",
				"c:\\Program Files\\Microsoft Security Client\\NisSrv.exe",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"smax4pnp.exe",
						"C:\\Program Files\\Analog Devices\\Core\\smax4pnp.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"IAStorIcon.exe",
						"C:\\Program Files\\Intel\\Intel(R) Rapid Storage Technology\\IAStorIcon.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"WavXDocMgr.exe",
						"C:\\Program Files\\Wave Systems Corp\\Services Manager\\DocMgr\\bin\\WavXDocMgr.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"BcmDeviceAndTaskStatusService.exe",
						"C:\\Program Files\\Dell\\Dell ControlPoint\\Security Manager\\BcmDeviceAndTaskStatusService.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("PDVDDXSrv.exe",
				"C:\\Program Files\\CyberLink\\PowerDVD DX\\PDVDDXSrv.exe",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("igfxtray.exe",
				"C:\\Windows\\System32\\igfxtray.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("hkcmd.exe",
				"C:\\Windows\\System32\\hkcmd.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("igfxpers.exe",
				"C:\\Windows\\System32\\igfxpers.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("msseces.exe",
				"C:\\Program Files\\Microsoft Security Client\\msseces.exe",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("wmdc.exe",
				"C:\\Windows\\WindowsMobile\\wmdc.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"TdmNotify.exe",
						"C:\\Program Files\\Wave Systems Corp\\Trusted Drive Manager\\TdmNotify.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("SearchIndexer.exe",
				"C:\\Windows\\system32\\SearchIndexer.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"PrivacyIconClient.exe",
						"C:\\Program Files\\Common Files\\Intel\\Privacy Icon\\PrivacyIconClient.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"OcsService.exe",
						"C:\\Program Files\\OCS Inventory Agent\\OcsService.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe",
				"C:\\Windows\\system32\\svchost.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"IAStorDataMgrSvc.exe",
						"C:\\Program Files\\Intel\\Intel(R) Rapid Storage Technology\\IAStorDataMgrSvc.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("lms.exe",
				"C:\\Program Files\\Intel\\AMT\\LMS.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"UNS.exe",
						"C:\\Program Files\\Common Files\\Intel\\Privacy Icon\\UNS\\UNS.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("wuauclt.exe",
				"C:\\Windows\\system32\\wuauclt.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"SeaPort.EXE",
						"C:\\Program Files\\Microsoft\\BingBar\\7.3.132.0\\SeaPort.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("cmd.exe",
				"C:\\Windows\\system32\\cmd.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("conhost.exe",
				"C:\\Windows\\system32\\conhost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("WUDFHost.exe",
				"C:\\Windows\\System32\\WUDFHost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("java.exe",
				"C:\\Windows\\system32\\java.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("SearchProtocolHost.exe",
				"C:\\Windows\\system32\\SearchProtocolHost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("SearchFilterHost.exe",
				"C:\\Windows\\system32\\SearchFilterHost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("SearchProtocolHost.exe",
				"C:\\Windows\\system32\\SearchProtocolHost.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("WMIC.exe",
				"C:\\Windows\\System32\\Wbem\\wmic.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("java.exe",
				"C:\\Program Files\\Java\\jre7\\bin\\java.exe", "944"));

		this.listaDeProcessosAceitos.add(new Processo("smath.exe", "C:\\Program Files\\BrOffice.org 3\\program\\smath.exe","944"));
		this.listaDeProcessosAceitos.add(new Processo("java.exe",
				"C:\\Program Files\\Java\\jdk1.6.0_21\\bin\\java.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("java.exe",
				"C:\\Program Files\\Java\\jre6\\bin\\java.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("chrome.exe",
				"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe",
				"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"ISIS.EXE",
						"C:\\Program Files (x86)\\Labcenter Electronics\\Proteus 7 Professional\\BIN\\ISIS.EXE",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"UniCafe.scr",
						"C:\\projetos\\unicafe\\projeto\\unicafeWin\\unicafe\\src\\main\\resources\\images\\UniCafe.scr",
						"944"));

		// bloqueios sistema 32bit
		// this.listaDeProcessosAceitos.add(new Processo("FrzState2k.exe",
		// "C:\\Program Files\\Faronics\\Deep Freeze\\Install C-0\\_$Df\\FrzState2k.exe",
		// "944"));
		// this.listaDeProcessosAceitos.add(new Processo("DFServ.exe",
		// "C:\\Program Files\\Faronics\\Deep Freeze\\Install C-0\\DFServ.exe",
		// "944"));
		this.listaDeProcessosAceitos.add(new Processo("antirun.exe",
				"C:\\Program Files\\Antirun\\antirun.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"AdobeARM.exe",
						"C:\\Program Files\\Common Files\\Adobe\\ARM\\1.0\\AdobeARM.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("AddInUtil.exe",
				"C:\\Windows\\Microsoft.NET\\Framework\\v3.5\\addinutil.exe",
				"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"AM_Delta_Patch_1.201.2218.0.exe",
						"C:\\Windows\\SoftwareDistribution\\Download\\Install\\AM_Delta_Patch_1.201.2218.0.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"AM_Delta_Patch_1.203.205.0.exe",
						"C:\\Windows\\SoftwareDistribution\\Download\\Install\\AM_Delta_Patch_1.203.205.0.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"AM_Delta_Patch_1.201.2067.0.exe",
						"C:\\Windows\\SoftwareDistribution\\Download\\Install\\AM_Delta_Patch_1.201.2067.0.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"AM_Delta_Patch_1.201.1937.0.exe",
						"C:\\Windows\\SoftwareDistribution\\Download\\Install\\AM_Delta_Patch_1.201.1937.0.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("AcroRd32.exe",
				"C:\\Program Files\\Adobe\\Reader 11.0\\Reader\\AcroRd32.exe",
				"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"AM_Base_Patch1.exe",
						"C:\\Windows\\SoftwareDistribution\\Download\\Install\\AM_Base_Patch1.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"AM_Delta.exe",
						"C:\\Windows\\SoftwareDistribution\\Download\\Install\\AM_Delta.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("CompatTelRunner.exe",
				"C:\\Windows\\system32\\CompatTelRunner.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("csc.exe",
				"C:\\Windows\\Microsoft.NET\\Framework\\v2.0.50727\\csc.exe",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("CompatTelRunner.exe",
				"C:\\Windows\\system32\\CompatTelRunner.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"chrmstp.exe",
						"C:\\Program Files\\Google\\Chrome\\Application\\43.0.2357.134\\Installer\\chrmstp.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("CompatTelRunner.exe",
				"C:\\Windows\\system32\\CompatTelRunner.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("DFLocker.exe",
				"C:\\Windows\\TEMP\\DFLocker.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"diagtrackrunner.exe",
						"C:\\Windows\\system32\\compattel\\DiagTrackRunner.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("firefox.exe",
				"C:\\Program Files\\Mozilla Firefox\\firefox.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("gpscript.exe",
				"C:\\Windows\\system32\\gpscript.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("GWXConfigManager.exe",
				"C:\\Windows\\system32\\GWX\\GWXConfigManager.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("GoogleUpdate.exe",
				"C:\\Program Files\\Google\\Update\\GoogleUpdate.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("gpscript.exe",
				"C:\\Windows\\system32\\gpscript.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("GWX.exe",
				"C:\\Windows\\system32\\GWX\\GWX.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"GoogleCrashHandler.exe",
						"C:\\Program Files\\Google\\Update\\1.3.28.1\\GoogleCrashHandler.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("gpscript.exe",
				"C:\\Windows\\system32\\gpscript.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"jusched.exe",
						"C:\\Program Files\\Common Files\\Java\\Java Update\\jusched.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("jp2launcher.exe",
				"C:\\Program Files\\Java\\jre7\\bin\\jp2launcher.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("mobsync.exe",
				"C:\\Windows\\System32\\mobsync.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("msoia.exe",
				"C:\\Program Files\\Microsoft Office\\Office15\\msoia.exe",
				"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"mscorsvw.exe",
						"C:\\Windows\\Microsoft.NET\\Framework\\v4.0.30319\\mscorsvw.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"mpam-fc777bc9.exe",
						"C:\\Windows\\SERVIC~2\\NETWOR~1\\AppData\\Local\\Temp\\mpam-fc777bc9.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"mpam-4c2ad6cf.exe",
						"C:\\Windows\\SERVIC~2\\NETWOR~1\\AppData\\Local\\Temp\\mpam-4c2ad6cf.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"mpam-943bc045.exe",
						"C:\\Windows\\SERVIC~2\\NETWOR~1\\AppData\\Local\\Temp\\mpam-943bc045.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"mpam-c4773883.exe",
						"C:\\Windows\\SERVIC~2\\NETWOR~1\\AppData\\Local\\Temp\\mpam-c4773883.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"mpam-7c4cdcc4.exe",
						"C:\\Windows\\SERVIC~2\\NETWOR~1\\AppData\\Local\\Temp\\mpam-7c4cdcc4.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("MPSigStub.exe",
				"c:\\59a0b9075bdf5a428ed9\\MpSigStub.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("mobsync.exe",
				"C:\\Windows\\System32\\mobsync.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"OLicenseHeartbeat.exe",
						"C:\\Program Files\\Common Files\\Microsoft Shared\\Office15\\OLicenseHeartbeat.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("OCSInventory.exe",
				"C:\\Program Files\\OCS Inventory Agent\\OCSInventory.exe",
				"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"OCS-NG-Windows-Agent-Setup.exe",
						"\\\\net.unilab.edu.br\\SysVol\\net.unilab.edu.br\\Policies\\{2A4896A8-6128-47A7-A2DB-32577BE2EDA9}\\Machine\\Scripts\\Startup\\OCS-NG-Windows-Agent-Setup.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"PIconStartup.exe",
						"C:\\Program Files\\Common Files\\Intel\\Privacy Icon\\PIconStartup.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("reader_sl.exe",
				"C:\\Program Files\\Adobe\\Reader 11.0\\Reader\\Reader_sl.exe",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("sc.exe",
				"C:\\Windows\\system32\\sc.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("sdiagnhost.exe",
				"C:\\Windows\\System32\\sdiagnhost.exe", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"TDMAuditLogger.exe",
						"C:\\Program Files\\Wave Systems Corp\\Trusted Drive Manager\\TDMAuditLogger.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"VCDDaemon.exe",
						"C:\\Program Files\\Elaborate Bytes\\VirtualCloneDrive\\VCDDaemon.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("wsqmcons.exe",
				"C:\\Windows\\System32\\wsqmcons.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("wermgr.exe",
				"C:\\Windows\\system32\\wermgr.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("wsqmcons.exe",
				"C:\\Windows\\System32\\wsqmcons.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("wsqmcons.exe",
				"C:\\Windows\\System32\\wsqmcons.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("wicainventory.exe",
				"C:\\Windows\\system32\\CompatTel\\WicaInventory.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("WatAdminSvc.exe",
				"C:\\Windows\\system32\\Wat\\WatAdminSvc.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("WerFault.exe",
				"C:\\Windows\\system32\\WerFault.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("POWERPNT.EXE",
				"C:\\Program Files\\Microsoft Office\\Office15\\POWERPNT.EXE",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("WINWORD.EXE",
				"C:\\Program Files\\Microsoft Office\\Office15\\WINWORD.EXE",
				"944"));
		this.listaDeProcessosAceitos.add(new Processo("armsvc.exe",
				"C:\\Program Files\\Common Files\\Adobe\\ARM\\1.0\\armsvc.exe",
				"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"OcsService.exe",
						"C:\\Program Files\\OCS Inventory Agent\\OcsService.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"OcsSystray.exe",
						"C:\\Program Files\\OCS Inventory Agent\\OcsSystray.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("eclipse.exe",
				"C:\\Program Files\\eclipse\\eclipse.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("UI0Detect.exe",
				"C:\\Windows\\system32\\UI0Detect.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("javaw.exe",
				"C:\\Program Files\\Java\\jre1.8.0_51\\bin\\javaw.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("wuauclt.exe",
				"C:\\Windows\\system32\\wuauclt.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("msiexec.exe",
				"C:\\Windows\\system32\\MsiExec.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("chrome.exe",
				"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe",
				"123"));
		this.listaDeProcessosAceitos.add(new Processo("chrome.exe",
				"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe",
				"123"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"setup_wm.exe",
						"C:\\Program Files\\Windows Media Player\\setup_wm.exe",
						"123"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"setup_wm.exe",
						"C:\\Program\\Files\\Windows Media Player\\setup_wm.exe",
						"123"));
		this.listaDeProcessosAceitos.add(new Processo("Eula.exe",
				"C:\\Program Files\\Adobe\\Reader 11.0\\Reader\\Eula.exe",
				"123"));
		this.listaDeProcessosAceitos.add(new Processo("helper.exe",
				"C:\\Program Files\\Mozilla Firefox\\uninstall\\helper.exe",
				"123"));
		this.listaDeProcessosAceitos.add(new Processo("plugin-container.exe",
				"C:\\Program Files\\Mozilla Firefox\\plugin-container.exe",
				"123"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"FlashPlayerPlugin_18_0_0_209.exe",
						"C:\\Windows\\system32\\Macromed\\Flash\\FlashPlayerPlugin_18_0_0_209.exe",
						"123"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"FlashPlayerPlugin_18_0_0_209.exe",
						"C:\\Windows\\system32\\Macromed\\Flash\\FlashPlayerPlugin_18_0_0_209.exe",
						"123"));
		this.listaDeProcessosAceitos.add(new Processo("plugin-container.exe",
				"C:\\Program Files\\Mozilla Firefox\\plugin-container.exe",
				"123"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"FlashPlayerPlugin_18_0_0_209.exe",
						"C:\\Windows\\system32\\Macromed\\Flash\\FlashPlayerPlugin_18_0_0_209.exe",
						"123"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"FlashPlayerPlugin_18_0_0_209.exe",
						"C:\\Windows\\system32\\Macromed\\Flash\\FlashPlayerPlugin_18_0_0_209.exe",
						"123"));
		this.listaDeProcessosAceitos.add(new Processo("plugin-container.exe",
				"C:\\Program Files\\Mozilla Firefox\\plugin-container.exe",
				"123"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"FlashPlayerPlugin_18_0_0_209.exe",
						"C:\\Windows\\system32\\Macromed\\Flash\\FlashPlayerPlugin_18_0_0_209.exe",
						"123"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"FlashPlayerPlugin_18_0_0_209.exe",
						"C:\\Windows\\system32\\Macromed\\Flash\\FlashPlayerPlugin_18_0_0_209.exe",
						"123"));
		this.listaDeProcessosAceitos.add(new Processo("dfsvc.exe",
				"C:\\Windows\\Microsoft.NET\\Framework\\v4.0.30319\\dfsvc.exe",
				"123"));
		this.listaDeProcessosAceitos.add(new Processo("dfsvc.exe",
				"C:\\Windows\\Microsoft.NET\\Framework\\v4.0.30319\\dfsvc.exe",
				"123"));
		this.listaDeProcessosAceitos.add(new Processo("mpc-hc.exe",
				"C:\\Program Files\\K-Lite Codec Pack\\MPC-HC\\mpc-hc.exe",
				"123"));
		this.listaDeProcessosAceitos.add(new Processo("sbase.exe",
				"C:\\Program Files\\LibreOffice 4\\program\\sbase.exe", "123"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"soffice.exe",
						"C:\\Program Files\\LibreOffice 4\\program\\soffice.exe",
						"123"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"soffice.bin",
						"C:\\Program Files\\LibreOffice 4\\program\\soffice.bin",
						"123"));
		this.listaDeProcessosAceitos.add(new Processo("scalc.exe",
				"C:\\Program Files\\LibreOffice 4\\program\\scalc.exe", "123"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"soffice.exe",
						"C:\\Program Files\\LibreOffice 4\\program\\soffice.exe",
						"123"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"soffice.bin",
						"C:\\Program Files\\LibreOffice 4\\program\\soffice.bin",
						"123"));
		this.listaDeProcessosAceitos.add(new Processo("sdraw.exe",
				"C:\\Program Files\\LibreOffice 4\\program\\sdraw.exe", "123"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"soffice.exe",
						"C:\\Program Files\\LibreOffice 4\\program\\soffice.exe",
						"123"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"soffice.bin",
						"C:\\Program Files\\LibreOffice 4\\program\\soffice.bin",
						"123"));
		this.listaDeProcessosAceitos.add(new Processo("simpress.exe",
				"C:\\Program Files\\LibreOffice 4\\program\\simpress.exe",
				"123"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"soffice.exe",
						"C:\\Program Files\\LibreOffice 4\\program\\soffice.exe",
						"123"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"soffice.bin",
						"C:\\Program Files\\LibreOffice 4\\program\\soffice.bin",
						"123"));
		this.listaDeProcessosAceitos.add(new Processo("smath.exe",
				"C:\\Program Files\\LibreOffice 4\\program\\smath.exe", "123"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"soffice.exe",
						"C:\\Program Files\\LibreOffice 4\\program\\soffice.exe",
						"123"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"soffice.bin",
						"C:\\Program Files\\LibreOffice 4\\program\\soffice.bin",
						"123"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"swriter.exe",
						"C:\\Program Files\\LibreOffice 4\\program\\swriter.exe",
						"123"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"soffice.exe",
						"C:\\Program Files\\LibreOffice 4\\program\\soffice.exe",
						"123"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"soffice.bin",
						"C:\\Program Files\\LibreOffice 4\\program\\soffice.bin",
						"123"));
		this.listaDeProcessosAceitos.add(new Processo("MSACCESS.EXE",
				"C:\\Program Files\\Microsoft Office\\Office15\\MSACCESS.EXE",
				"123"));
		this.listaDeProcessosAceitos.add(new Processo("EXCEL.EXE",
				"C:\\Program Files\\Microsoft Office\\Office15\\EXCEL.EXE",
				"123"));
		this.listaDeProcessosAceitos.add(new Processo("INFOPATH.EXE",
				"C:\\Program Files\\Microsoft Office\\Office15\\INFOPATH.EXE",
				"123"));
		this.listaDeProcessosAceitos.add(new Processo("INFOPATH.EXE",
				"C:\\Program Files\\Microsoft Office\\Office15\\INFOPATH.EXE",
				"123"));
		this.listaDeProcessosAceitos.add(new Processo("GROOVE.EXE",
				"C:\\Program Files\\Microsoft Office\\Office15\\GROOVE.EXE",
				"123"));
		this.listaDeProcessosAceitos.add(new Processo("ONENOTE.EXE",
				"C:\\Program Files\\Microsoft Office\\Office15\\ONENOTE.EXE",
				"123"));
		this.listaDeProcessosAceitos.add(new Processo("OUTLOOK.EXE",
				"C:\\Program Files\\Microsoft Office\\Office15\\OUTLOOK.EXE",
				"123"));
		this.listaDeProcessosAceitos.add(new Processo("FIRSTRUN.EXE",
				"C:\\Program Files\\Microsoft Office\\Office15\\FIRSTRUN.EXE",
				"123"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"MSOSQM.EXE",
						"C:\\Program Files\\Common Files\\Microsoft Shared\\Office15\\msosqm.exe",
						"123"));
		this.listaDeProcessosAceitos.add(new Processo("lync.exe",
				"C:\\Program Files\\Microsoft Office\\Office15\\lync.exe",
				"123"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"MSOSQM.EXE",
						"C:\\Program Files\\Common Files\\Microsoft Shared\\Office15\\msosqm.exe",
						"123"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"Silverlight.Configuration.exe",
						"C:\\Program Files\\Microsoft Silverlight\\5.1.40416.0\\Silverlight.Configuration.exe",
						"123"));
		this.listaDeProcessosAceitos.add(new Processo("Skype.exe",
				"C:\\Program Files\\Skype\\Phone\\Skype.exe", "123"));
		this.listaDeProcessosAceitos.add(new Processo("vlc.exe",
				"C:\\Program Files\\VideoLAN\\VLC\\vlc.exe", "123"));
		this.listaDeProcessosAceitos.add(new Processo("vlc.exe",
				"C:\\Program Files\\VideoLAN\\VLC\\vlc.exe", "123"));
		this.listaDeProcessosAceitos.add(new Processo("TeamViewer.exe",
				"C:\\Program Files\\TeamViewer\\Version9\\TeamViewer.exe",
				"123"));
		this.listaDeProcessosAceitos
				.add(new Processo("unregmp2.exe", "", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"wmplayer.exe",
						"C:\\Program Files\\Windows Media Player\\wmplayer.exe",
						"944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"software_reporter_tool.exe",
						user
								+ "\\AppData\\Local\\Google\\Chrome\\User Data\\SwReporter\\3.21.0\\software_reporter_tool.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("SearchFilterHost.exe",
				"", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo("msiexec.exe", "", "944"));
		this.listaDeProcessosAceitos
				.add(new Processo(
						"AcroRd32.exe",
						"C:\\Program Files\\Adobe\\Acrobat Reader DC\\Reader\\AcroRd32.exe",
						"944"));
		this.listaDeProcessosAceitos.add(new Processo("net1.exe", "", "944"));
		this.listaDeProcessosAceitos.add(new Processo("TeamViewer_Service.exe","C:\\Program Files\\TeamViewer\\Version9\\TeamViewer_Service.exe","944"));
		this.listaDeProcessosAceitos.add(new Processo("javaw.exe", System.getProperty("sun.boot.library.path") + "\\javaw.exe", "5632"));
		this.listaDeProcessosAceitos.add(new Processo("java.exe", System.getProperty("sun.boot.library.path") + "\\java.exe", "5632"));
		this.listaDeProcessosAceitos.add(new Processo("OCSInventory.exe", "","944"));
		this.listaDeProcessosAceitos.add(new Processo("FlashPlayerUpdateService.exe","C:\\Windows\\system32\\Macromed\\Flash\\FlashPlayerUpdateService.exe","944"));
		this.listaDeProcessosAceitos.add(new Processo("mobsync.exe", "", "944"));
		this.listaDeProcessosAceitos.add(new Processo("chrome.exe", "", "6712"));
		this.listaDeProcessosAceitos.add(new Processo("cmd", "", "6712"));
		this.listaDeProcessosAceitos.add(new Processo("jucheck.exe","C:\\Program Files (x86)\\Common Files\\Java\\Java Update\\jucheck.exe","6712"));
		this.listaDeProcessosAceitos.add(new Processo("GoogleCrashHandler.exe", "C:\\Program Files (x86)\\Google\\Update\\1.3.28.1\\GoogleCrashHandler.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("GoogleCrashHandler64.exe","C:\\Program Files (x86)\\Google\\Update\\1.3.28.1\\GoogleCrashHandler64.exe","944"));
		this.listaDeProcessosAceitos.add(new Processo("FlashPlayerPlugin_13_0_0_214.exe","C:\\Windows\\SysWOW64\\Macromed\\Flash\\FlashPlayerPlugin_13_0_0_214.exe","944"));
		this.listaDeProcessosAceitos.add(new Processo("FlashPlayerUpdateService.exe", "", "944"));
		this.listaDeProcessosAceitos.add(new Processo("FlashPlayerUpdateService.exe", "", "944"));
		this.listaDeProcessosAceitos.add(new Processo("chrmstp.exe", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\44.0.2403.130\\Installer\\chrmstp.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("OIS.EXE", "C:\\PROGRA~2\\MICROS~2\\Office14\\OIS.EXE", "944"));		
		this.listaDeProcessosAceitos.add(new Processo("software_reporter_tool.exe", "C:\\localunicafe\\irlandia\\local\\Google\\Chrome\\User Data\\SwReporter\\4.28.1\\software_reporter_tool.exe", "944"));		
		this.listaDeProcessosAceitos.add(new Processo("igfxsrvc.exe", "", "944"));
		this.listaDeProcessosAceitos.add(new Processo("LiveUpdate.exe", "C:\\Program Files (x86)\\IObit\\LiveUpdate\\LiveUpdate.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("IObitLauncher.exe", "C:\\Program Files (x86)\\IObit\\LiveUpdate\\IObitLauncher.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("Updater.exe", "C:\\Program Files (x86)\\Skype\\Updater\\Updater.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("IAStorIcon.exe", "", "944"));
		this.listaDeProcessosAceitos.add(new Processo("OCS-NG-Windows-Agent-Setup.exe", "", "944"));
		this.listaDeProcessosAceitos.add(new Processo("rundll32.exe", "", "944"));
		this.listaDeProcessosAceitos.add(new Processo("wicainventory.exe", "", "944"));
		this.listaDeProcessosAceitos.add(new Processo("AM_Delta_Patch_1.203.1791.0.exe", "C:\\Windows\\SoftwareDistribution\\Download\\Install\\AM_Delta_Patch_1.203.1791.0.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("mpam-a6cbaad3.exe", "C:\\Windows\\SERVIC~2\\NETWOR~1\\AppData\\Local\\Temp\\mpam-a6cbaad3.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("mpam-8733523d.exe", "C:\\Windows\\SERVIC~2\\NETWOR~1\\AppData\\Local\\Temp\\mpam-8733523d.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("core.exe", "", "944"));
		
		this.listaDeProcessosAceitos.add(new Processo("EXCEL.EXE", "C:\\Program Files\\Microsoft Office\\Office14\\EXCEL.EXE", "944"));
		this.listaDeProcessosAceitos.add(new Processo("POWERPNT.EXE", "C:\\Program Files\\Microsoft Office\\Office14\\POWERPNT.EXE", "944"));
		this.listaDeProcessosAceitos.add(new Processo("WINWORD.EXE", "C:\\Program Files\\Microsoft Office\\Office14\\WINWORD.EXE", "944"));
		this.listaDeProcessosAceitos.add(new Processo("googleearth.exe", "C:\\Program Files (x86)\\Google\\Google Earth Pro\\client\\googleearth.exe", "944"));
			
		this.listaDeProcessosAceitos.add(new Processo("javaw.exe", "C:\\Windows\\system32\\javaw.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("wuauclt.exe", "", "944"));
		this.listaDeProcessosAceitos.add(new Processo("studio64.exe", "C:\\Program Files\\Android\\Android Studio\\bin\\studio64.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("fsnotifier64.exe", "C:\\Program Files\\Android\\Android Studio\\bin\\fsnotifier64.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("jucheck.exe", "", "944"));
		this.listaDeProcessosAceitos.add(new Processo("java.exe", "C:\\Program Files\\Android\\Android Studio\\jre\\bin\\java.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("SearchIndexer.exe", "", "944"));
		this.listaDeProcessosAceitos.add(new Processo("BizagiModeler.exe", "C:\\Program Files\\Bizagi\\Bizagi Modeler\\Modeler\\BizagiModeler.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("wsffcmgr.exe", "C:\\Program Files\\Diebold\\Warsaw\\wsffcmgr.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("core.exe", "C:\\Program Files\\Diebold\\Warsaw\\core.exe", "944"));
		this.listaDeProcessosAceitos.add(new Processo("Name", "ExecutablePath", "944"));
		this.listaDeProcessosAceitos.add(new Processo("CefSharp.BrowserSubprocess.exe", "C:\\Program Files\\Bizagi\\Bizagi Modeler\\Modeler\\CefSharp.BrowserSubprocess.exe", "944"));

	}

	public void buscaAtivos() {

		this.processosAtivos = new ArrayList<Processo>();
		Process process;
		Scanner leitor;

		try {

			process = Runtime
					.getRuntime()
					.exec(" wmic process  get ProcessID, Name, ExecutablePath /FORMAT:CSV");
			leitor = new Scanner(process.getInputStream());
			
			while (leitor.hasNext()) {
				String linha = leitor.nextLine();
				if(linha.equals("")){
					continue;
				}

				//System.out.println(linha);
				String[] vDados = linha.split("[,]");
				this.processosAtivos.add(new Processo(vDados[2], vDados[1],
						vDados[3]));

//				System.out.println("ID: "+vDados[3]+", Imagem: "+vDados[2]+", pasta: "+vDados[1].replace("","").toString());

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void comparaEMata() {

		boolean existeNaLista = false;
		for (Processo processoAtivo : this.processosAtivos) {
			existeNaLista = false;
			
			//Liberando tudo da pasta do autocad. 
			
			if(processoAtivo.getExecutablePath().length() > 38){
				if(processoAtivo.getExecutablePath().substring(0,38).equals("C:\\Program Files\\Autodesk\\AutoCAD 2016")){
					existeNaLista = true;
					continue;	 
				}
			}
			 
			
			for (Processo processoAceito : this.listaDeProcessosAceitos) {

				if (processoAtivo.equals(processoAceito)) {
					existeNaLista = true;
					break;

				}

			}
			if (!existeNaLista) {

				try {
					Runtime.getRuntime().exec(
							" taskkill /PID \"" + processoAtivo.getProcessId()
									+ "\" /F");

					// System.out.println("Processo Bloqueado: "+processoAtivo.getExecutablePath()+","+processoAtivo.getImagem()+",123");

					new Log("this.listaDeProcessosAceitos.add(new Processo(\""
							+ processoAtivo.getImagem() + "\", \""
							+ processoAtivo.getExecutablePath()
							+ "\", \"944\"));");
					System.out
							.println("this.listaDeProcessosAceitos.add(new Processo(\""
									+ processoAtivo.getImagem()
									+ "\", \""
									+ processoAtivo.getExecutablePath()
									+ "\", \"944\"));");

				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

	}

	public void mostraProcessos() {
		for (Processo p : this.processosAtivos) {
			System.out.println(p);
		}
	}
}
