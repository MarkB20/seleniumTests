import org.openqa.selenium.By;

import java.util.*;

public class PricingEssentialBoxPage {

    //grabs label from Label class and puts them into a list
    private List<EssentialLabel> label = new ArrayList<>();

    public List<EssentialLabel> getLabel() {
        return label;
    }

    public void addLabel(List label){
        label.add(label);
    }

    public void addAllLabels(Collection<EssentialLabel> labels){
        this.label.addAll(labels);

    }





//    public String getLabels () {
//
//        //var t = essentialLabel.toString();
//         //return t;
//    }

        static final Map<String,By> EssentialLabel;
        static{
            final Map<String, By> essentialLabel = new HashMap<>();
            essentialLabel.put("essentialLabel", By.cssSelector(".title-heading-left"));
            essentialLabel.put("PriceLabel", By.cssSelector(""));
            essentialLabel.put("SupportLabel", By.cssSelector(""));
            essentialLabel.put("RecommendedLabel", By.cssSelector(""));
            essentialLabel.put("ChoosePlanLabel", By.cssSelector(""));
            essentialLabel.put("MeridianCoreLabel", By.cssSelector(""));
            essentialLabel.put("MinionsLabel", By.cssSelector(""));
            essentialLabel.put("installationConsultingLabel", By.cssSelector(""));
            essentialLabel.put("HelmLabel", By.cssSelector(""));
            essentialLabel.put("PostgreSQlLabel", By.cssSelector(""));
            essentialLabel.put("ResponseTimesLabel", By.cssSelector(""));
            essentialLabel.put("CriticalLabel", By.cssSelector(""));
            essentialLabel.put("NonUrgentLabel", By.cssSelector(""));
            essentialLabel.put("BusinessHoursTitleLabel", By.cssSelector(""));
            essentialLabel.put("BusinessHoursLabel", By.cssSelector(""));
            EssentialLabel = Collections.unmodifiableMap(essentialLabel);
        }
}


