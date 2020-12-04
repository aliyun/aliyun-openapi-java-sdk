/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.eci.model.v20180808;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.eci.transform.v20180808.DescribeContainerGroupPriceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.List;

/**
 * @author auto create
 */
public class DescribeContainerGroupPriceResponse extends AcsResponse {

    private String requestId;

    private PriceInfo priceInfo;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public PriceInfo getPriceInfo() {
        return priceInfo;
    }

    public void setPriceInfo(PriceInfo priceInfo) {
        this.priceInfo = priceInfo;
    }

    public static class PriceInfo {

        private Rules rules;

        private Price price;

        private SpotPrices spotPrices;

        public Rules getRules() {
            return rules;
        }

        public void setRules(Rules rules) {
            this.rules = rules;
        }

        public Price getPrice() {
            return price;
        }

        public void setPrice(Price price) {
            this.price = price;
        }

        public SpotPrices getSpotPrices() {
            return spotPrices;
        }

        public void setSpotPrices(SpotPrices spotPrices) {
            this.spotPrices = spotPrices;
        }

        public static class Rules {

            private List<Rule> rule;

            public List<Rule> getRule() {
                return rule;
            }

            public void setRule(List<Rule> rule) {
                this.rule = rule;
            }

            public static class Rule {

                private Long ruleId;

                private String description;

                public Long getRuleId() {
                    return ruleId;
                }

                public void setRuleId(Long ruleId) {
                    this.ruleId = ruleId;
                }

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }
            }
        }

        public static class Price {

            private Float originalPrice;

            private Float discountPrice;

            private Float tradePrice;

            private String currency;

            private DetailInfos detailInfos;

            public Float getOriginalPrice() {
                return originalPrice;
            }

            public void setOriginalPrice(Float originalPrice) {
                this.originalPrice = originalPrice;
            }

            public Float getDiscountPrice() {
                return discountPrice;
            }

            public void setDiscountPrice(Float discountPrice) {
                this.discountPrice = discountPrice;
            }

            public Float getTradePrice() {
                return tradePrice;
            }

            public void setTradePrice(Float tradePrice) {
                this.tradePrice = tradePrice;
            }

            public String getCurrency() {
                return currency;
            }

            public void setCurrency(String currency) {
                this.currency = currency;
            }

            public DetailInfos getDetailInfos() {
                return detailInfos;
            }

            public void setDetailInfos(DetailInfos detailInfos) {
                this.detailInfos = detailInfos;
            }

            public static class DetailInfos {

                private List<DetailInfos.DetailInfo> detailInfo;

                public List<DetailInfo> getDetailInfo() {
                    return detailInfo;
                }

                public void setDetailInfo(List<DetailInfo> detailInfo) {
                    this.detailInfo = detailInfo;
                }

                public static class DetailInfo {

                    private String resource;

                    private Float originalPrice;

                    private Float discountPrice;

                    private Float tradePrice;

                    private Rules rules;

                    public static class Rules {

                        private List<PriceInfo.Price.DetailInfos.DetailInfo.Rules.Rule> rule;


                        public List<Rule> getRule() {
                            return rule;
                        }

                        public void setRule(List<Rule> rule) {
                            this.rule = rule;
                        }

                        public static class Rule {

                            private Long ruleId;

                            private String description;

                            public Long getRuleId() {
                                return ruleId;
                            }

                            public void setRuleId(Long ruleId) {
                                this.ruleId = ruleId;
                            }

                            public String getDescription() {
                                return description;
                            }

                            public void setDescription(String description) {
                                this.description = description;
                            }
                        }
                    }

                    public String getResource() {
                        return resource;
                    }

                    public void setResource(String resource) {
                        this.resource = resource;
                    }

                    public Float getOriginalPrice() {
                        return originalPrice;
                    }

                    public void setOriginalPrice(Float originalPrice) {
                        this.originalPrice = originalPrice;
                    }

                    public Float getDiscountPrice() {
                        return discountPrice;
                    }

                    public void setDiscountPrice(Float discountPrice) {
                        this.discountPrice = discountPrice;
                    }

                    public Float getTradePrice() {
                        return tradePrice;
                    }

                    public void setTradePrice(Float tradePrice) {
                        this.tradePrice = tradePrice;
                    }

                    public Rules getRules() {
                        return rules;
                    }

                    public void setRules(Rules rules) {
                        this.rules = rules;
                    }
                }
            }
        }

        public static class SpotPrices {

            private List<SpotPrices.SpotPrice> spotPrice;

            public List<SpotPrice> getSpotPrice() {
                return spotPrice;
            }

            public void setSpotPrice(List<SpotPrice> spotPrice) {
                this.spotPrice = spotPrice;
            }

            public static class SpotPrice {

                private Float spotPrice;

                private Float originPrice;

                private String zoneId;

                private String instanceType;

                public Float getSpotPrice() {
                    return this.spotPrice;
                }

                public void setSpotPrice(Float spotPrice) {
                    this.spotPrice = spotPrice;
                }

                public Float getOriginPrice() {
                    return this.originPrice;
                }

                public void setOriginPrice(Float originPrice) {
                    this.originPrice = originPrice;
                }

                public String getZoneId() {
                    return this.zoneId;
                }

                public void setZoneId(String zoneId) {
                    this.zoneId = zoneId;
                }

                public String getInstanceType() {
                    return this.instanceType;
                }

                public void setInstanceType(String instanceType) {
                    this.instanceType = instanceType;
                }
            }
        }
    }

    @Override
    public DescribeContainerGroupPriceResponse getInstance(UnmarshallerContext context) {
        return DescribeContainerGroupPriceResponseUnmarshaller.unmarshall(this, context);
    }
}
