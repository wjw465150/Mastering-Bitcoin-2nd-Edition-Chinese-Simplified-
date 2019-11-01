def parten = ~/^#{2,3}\s{1}.{1,}/
def parten2 = ~/[a-zA-Z]{1}[a-zA-Z -\\’]{1,}/

def cname = "14第十二章.md"
def name="c:\\WJW_E\\白石-Markdown\\精通比特币（第二版）\\${cname}"
String newLine;
String[] twoHead
new File(name).eachLine{line->
  if (parten.matcher(line.trim()).matches() ) {
    twoHead = line.split(" \\{\\#")
    if(twoHead.length==2) {
      println "".padLeft((twoHead[0].count("#")-1)*2)+"* ["+twoHead[0].replaceAll("#","")+"](${cname}#"+twoHead[1].replaceAll("\\{#","").replaceAll("}",")")
    } else {
      println "".padLeft((twoHead[0].count("#")-1)*2)+"* ["+twoHead[0].replaceAll("#","").trim()+"](${cname}#"+twoHead[0].replaceAll("#","").trim()+")"
    }
  }
}
