Feature:
  Scenario: Testing if Pricing webpage is there
    Given i am on the openNMS pricing web page
    When i verify that i am on the Pricing page
    Then quit browser

# Meridian, $12,000, 1 Meridian core, Minions, installation Consulting, Choose plan
  Scenario Outline: Testing Meridian block
    Given i am on openNMS pricing page
    When the page loaded
    Then the Meridian labels "<MeridianPricingModelLabel>" has the <LabelText>
    And quit browser
    Examples:
    |MeridianPricingModelLabel   |LabelText                    |
    |MeridianLabel                |    "Meridian"               |
    |PriceLabel                   |    "12,000"                 |
    |MeridianCoreLabel            |    "1 Meridian core"        |
    |MinionsLabel                 |    "Minions"                |
    |installationConsultingLabel  |    "installation Consulting"|
    |ChoosePlanButtonLabel        |    "Choose plan"            |



#Add-Ons, 24/support: $24,00, Appliance: $500, 1U Hardware Appliance: $15,000, Appliance Subscription: $600/year,
Scenario Outline: Testing Add-Ons block
  Given i am on openNMS pricing page
  When the page loaded
  Then the Add-Ons labels "<Add-OnsPricingModelLabel>" has the <LabelText>
  And quit browser
Examples:
  |Add-OnsPricingModelLabel   |LabelText                                   |
  |Add-OnsLabel                 |   "Add-Ons"                                |
  |supportLabel              |   "24/support: $24,00"                     |
  |ApplianceLabel               |   "Appliance: $500"                        |
  |HardwareLabel              |   "1U Hardware Appliance: $15,000 "        |
  |ApplianceSubscriptionLabel   |   "Appliance Subscription: $600/year"      |


#Essential, $39,600, support, Recommended, Choose plan
#2 Meridian core, 25 Minions, installation Consulting,
#  Helm, PostgreSQl, Response Times, Critical 4 hrs, Non-urgent: 48 hrs, Business Hours, 7am-7pm ET Mon-fri
  Scenario Outline: Testing Essential block
    Given i am on openNMS pricing page
    When the page loaded
    Then the label "<EssentialPricingModelLabel>" has the <LabelText>
    And quit browser
    Examples:
    |EssentialPricingModelLabel | LabelText                   |
    |EssentialLabel             |   "Essential"               |
    |PriceLabel                 |    "$39,600"                |
    |SupportLabel               |   "Support"                 |
    |RecommendedLabel           |   "Recommended"             |
    |ChoosePlanLabel            |   "Choose plan"             |
    |MeridianCoreLabel          |   "2 Meridian core"         |
    |MinionsLabel               |   "25 Minions"              |
    |installationConsultingLabel|   "installation Consulting" |
    |HelmLabel                  |   "Helm"                    |
    |PostgreSQlLabel            |   "PostgreSQl"              |
    |ResponseTimesLabel         |   "Response Times"          |
    |CriticalLabel              |   "Critical 4 hrs"          |
    |NonUrgentLabel            |   "Non-urgent: 48 hrs"      |
    |BusinessHoursTitleLabel    |   "Business Hours"          |
    |BusinessHoursLabel         |   "7am-7pm ET Mon-fri"      |




# Premier, $54,000, 6 Meridian core, 100 Minions, installation Consulting,Support,Everything in Essential, Drift, Sentinel
#  ALEC, NewTS, Kafka Cluster, Response Times, Critical 4 hrs, Non-urgent: 48 hrs, Business Hours, 7am-7pm ET Mon-fri
##  Choose plan
Scenario Outline: Testing Premier block
  Given i am on openNMS pricing page
  When the page loaded
  Then the Premier label "<PremierPricingModelLabel>" has the <LabelText>
  And quit browser
  Examples:
  |PremierPricingModelLabel    |LabelText                         |
  |PremierLabel                  |    "Premier"                     |
  |PricingLabel                  |    "$54,000"                     |
  |MeridianCoreLabel             |    "100 Minions"                 |
  |InstallationConsultingLabel   |    "installation Consulting"     |
  |SupportLabel                  |    "Support"                     |
  |EverythingInEssentialLabel    |    "Everything in Essential"     |
  |DriftLabel                    |    "Drift"                       |
  |SentinelLabel                 |    "Sentinel"                    |
  |ALECLabel                     |    "ALEC"                        |
  |NewTSLabel                    |    "NewTS"                       |
  |KafkaClusterLabel             |    "Kafka Cluster"               |
  |ResponseTimesLabel            |    "Critical 4 hrs"              |
  |NonUrgentLabel               |    "Non-urgent: 48 hrs"          |
  |BusinessHoursTitleLabel       |    "Business Hours"              |
  |BusinessHoursLabel            |    "7am-7pm ET Mon-fri"          |






#Premier+, $66,000, 6 Meridian core, 100 Minions, installation Consulting, Support, Everything in Premier, Higher SLA
#Midyear Check, Response Times, Critical 2 hrs, Non-urgent: 24 hrs, Business Hours, 7am-7pm ET Mon-fri, Contact us
  Scenario Outline: Testing Premier+ Block
    Given i am on openNMS pricing page
    When the page loaded
    Then the Premier+ label "<Premier+PricingModelLabel>" has the <LabelText>
    And quit browser
    Examples:
    |Premier+PricingModelLabel   |LabelText                          |
    |PremierPlusLabel                |      "Premier+"                   |
    |PricingLabel                 |      "$66,000"                    |
    |MeridianCoreLabel            |      "6 Meridian core"            |
    |MinionsLabel                 |      "100 Minions"                |
    |installationConsultingLabel  |      "installation Consulting"    |
    |SupportLabel                 |      "Support"                    |
    |EverythingInPremierLabel     |      "Everything in Premier"      |
    |HigherSLALabel               |      "Higher SLA"                 |
    |MidyearCheckLabel            |      "Midyear Check"              |
    |ResponseTimesLabel           |      "Response Times"             |
    |CriticalHrsLabel             |      "Critical 2 hrs"             |
    |NonUrgentLabel              |      "Non-urgent: 24 hrs"         |
    |BusinessHoursTitleLabel      |      "Business Hours"             |
    |BusinessHoursLabel           |      "7am-7pm ET Mon-fri"         |
    |ContactUsButton              |      "Contact us"                 |









