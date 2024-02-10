package git_github;

public class GithubKullanimi02 {
    /*
    *****KURULUM*****
    git --version                                    ===>    bunu github ı yukledigimizde  bir kereye mahsus kullaniriz
    git config --global user.email "email_adresiniz" ===>	"Yapılan commit leri burada belirtilen
                                                             isim ve eposta ile ilişkilendirir. Repo
                                                             da çalışan diğer kişiler bu isim ve
                                                             epostayı görür.
    git config --global user.name "isminiz"
    git config --global -l	                         ===>    Ayarları listeler.
                                                             Terminal de komutların renklendirilmesini sağlar
     */

    /*
    *****PROJE BASLANGICI*****
    git init                                         ===>	 git ile projemiz ilişkilendirir
    git status	                                     ===>    Working Space veya Staging area’ nın durumunu görmek için kullanılır
    git add .  Veya git add dosya_adi	             ===>    Working'den staging area'ya gönderir
    git commit -m "[first commit]"	                 ===>    Versiyon oluşturur
    git diff 	                                     ===>    Working space deki değişikliği gösterir
    git diff --staged	                             ===>    Staging Area daki değişiklikleri gösterir
    git show [hashcode]	                             ===>    Versiyondaki değişiklikleri gösterir
    git log  Veya git log --oneline Veya git reflog	 ===>    Oluşturulan versiyonları görmek için bu komut kullanılır
    git remote add origin https://github.com/techproed2020/Git_...
    git push -u origin master
     */


    /*
            Working Space		         Stage Area		                             Commit Store
                         >	git add .  >	       >	git commit -m "first commit" >
     */


    /*
     *****DEGISIKLIKLERI IPTAL ETMEK*****
     git restore [dosya]	                  ===>   Tek bir dosyayı iptal eder. ( Working Space )
     git restore .	                          ===>   Tüm dosyaları iptal eder. ( Working Space )
     git restore --staged [dosya]	          ===>   Tek bir dosyayı iptal eder. ( Stage Area )
     git restore --staged .	                  ===>   Tüm dosyaları iptal eder. ( Stage Area )
     */

    /*
       *****VERSIYONLAR VE BRANCHLER ARASINDA GECİS YAPMAK*****
    git checkout [commit_Log_Hashcode] [dosya]	    ===>  versiyonlar arasında geçişi  sağlar.
                                                          Dosya,hash ile belirtilen versiyona döner.
    git checkout [commit_Log_Hashcode] .	        ===>  Hash değeri verilen versiyona döner.
    git reset --hard  	                            ===>  Working space deki değişiklikleri iptal eder,
                                                          staging area yı boşaltır. ( risklidir. aradaki commitler silinir.)
     */

    /*
    Not:
        git checkout [hash] .
        Komutunu çalıştırıp yeni commit oluştururabilirsin.
        Önceki versiyonlardaki duruma kodu geri döndürüp önceki versiyonlardan birini
        son versiyon yaparsın ama versiyonların hepsi durur.
        git reset --hard komutunda aradaki commitler silinir.
     */
}
