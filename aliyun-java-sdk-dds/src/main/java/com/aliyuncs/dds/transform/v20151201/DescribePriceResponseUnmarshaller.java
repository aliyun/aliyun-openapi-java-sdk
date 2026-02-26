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

package com.aliyuncs.dds.transform.v20151201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dds.model.v20151201.DescribePriceResponse;
import com.aliyuncs.dds.model.v20151201.DescribePriceResponse.Order;
import com.aliyuncs.dds.model.v20151201.DescribePriceResponse.Order.Coupon;
import com.aliyuncs.dds.model.v20151201.DescribePriceResponse.Order.DepreciateInfo5;
import com.aliyuncs.dds.model.v20151201.DescribePriceResponse.Order.DepreciateInfo5.ContractActivity8;
import com.aliyuncs.dds.model.v20151201.DescribePriceResponse.Rule;
import com.aliyuncs.dds.model.v20151201.DescribePriceResponse.SubOrder;
import com.aliyuncs.dds.model.v20151201.DescribePriceResponse.SubOrder.DepreciateInfo;
import com.aliyuncs.dds.model.v20151201.DescribePriceResponse.SubOrder.DepreciateInfo.ContractActivity;
import com.aliyuncs.dds.model.v20151201.DescribePriceResponse.SubOrder.ModuleInstanceItem;
import com.aliyuncs.dds.model.v20151201.DescribePriceResponse.SubOrder.ModuleInstanceItem.DepreciateInfo1;
import com.aliyuncs.dds.model.v20151201.DescribePriceResponse.SubOrder.ModuleInstanceItem.ModuleAttr;
import com.aliyuncs.dds.model.v20151201.DescribePriceResponse.SubOrder.ModuleInstanceItem.PromDetail;
import com.aliyuncs.dds.model.v20151201.DescribePriceResponse.SubOrder.OptionalPromotion;
import com.aliyuncs.dds.model.v20151201.DescribePriceResponse.SubOrder.PromDetail3;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePriceResponseUnmarshaller {

	public static DescribePriceResponse unmarshall(DescribePriceResponse describePriceResponse, UnmarshallerContext _ctx) {
		
		describePriceResponse.setRequestId(_ctx.stringValue("DescribePriceResponse.RequestId"));
		describePriceResponse.setTraceId(_ctx.stringValue("DescribePriceResponse.TraceId"));
		describePriceResponse.setOrderParams(_ctx.stringValue("DescribePriceResponse.OrderParams"));

		Order order = new Order();
		order.setOriginalAmount(_ctx.stringValue("DescribePriceResponse.Order.OriginalAmount"));
		order.setDiscountAmount(_ctx.stringValue("DescribePriceResponse.Order.DiscountAmount"));
		order.setTradeAmount(_ctx.stringValue("DescribePriceResponse.Order.TradeAmount"));
		order.setCurrency(_ctx.stringValue("DescribePriceResponse.Order.Currency"));
		order.setShowDiscountInfo(_ctx.booleanValue("DescribePriceResponse.Order.ShowDiscountInfo"));
		order.setOptionalPromotions(_ctx.stringValue("DescribePriceResponse.Order.OptionalPromotions"));
		order.setPromDetailList(_ctx.stringValue("DescribePriceResponse.Order.PromDetailList"));
		order.setStandDiscountPrice(_ctx.doubleValue("DescribePriceResponse.Order.StandDiscountPrice"));
		order.setStandPrice(_ctx.doubleValue("DescribePriceResponse.Order.StandPrice"));
		order.setContractActivity(_ctx.booleanValue("DescribePriceResponse.Order.ContractActivity"));
		order.setCode(_ctx.stringValue("DescribePriceResponse.Order.Code"));
		order.setMessage(_ctx.stringValue("DescribePriceResponse.Order.Message"));
		order.setIsContractActivity(_ctx.booleanValue("DescribePriceResponse.Order.IsContractActivity"));
		order.setTotalCostAmount(_ctx.doubleValue("DescribePriceResponse.Order.TotalCostAmount"));

		List<String> ruleIds4 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribePriceResponse.Order.RuleIds.Length"); i++) {
			ruleIds4.add(_ctx.stringValue("DescribePriceResponse.Order.RuleIds["+ i +"]"));
		}
		order.setRuleIds4(ruleIds4);

		DepreciateInfo5 depreciateInfo5 = new DepreciateInfo5();
		depreciateInfo5.setListPrice(_ctx.doubleValue("DescribePriceResponse.Order.DepreciateInfo.ListPrice"));
		depreciateInfo5.setOriginalStandAmount(_ctx.doubleValue("DescribePriceResponse.Order.DepreciateInfo.OriginalStandAmount"));
		depreciateInfo5.setCheapStandAmount(_ctx.doubleValue("DescribePriceResponse.Order.DepreciateInfo.CheapStandAmount"));
		depreciateInfo5.setCheapRate(_ctx.doubleValue("DescribePriceResponse.Order.DepreciateInfo.CheapRate"));
		depreciateInfo5.setDifferential(_ctx.doubleValue("DescribePriceResponse.Order.DepreciateInfo.Differential"));
		depreciateInfo5.setDifferentialName(_ctx.stringValue("DescribePriceResponse.Order.DepreciateInfo.DifferentialName"));
		depreciateInfo5.setMonthPrice(_ctx.doubleValue("DescribePriceResponse.Order.DepreciateInfo.MonthPrice"));
		depreciateInfo5.setIsContractActivity(_ctx.booleanValue("DescribePriceResponse.Order.DepreciateInfo.IsContractActivity"));
		depreciateInfo5.setIsShow(_ctx.stringValue("DescribePriceResponse.Order.DepreciateInfo.IsShow"));

		ContractActivity8 contractActivity8 = new ContractActivity8();
		contractActivity8.setFinalPromFee(_ctx.doubleValue("DescribePriceResponse.Order.DepreciateInfo.ContractActivity.FinalPromFee"));
		contractActivity8.setFinalFee(_ctx.doubleValue("DescribePriceResponse.Order.DepreciateInfo.ContractActivity.FinalFee"));
		contractActivity8.setProdFee(_ctx.doubleValue("DescribePriceResponse.Order.DepreciateInfo.ContractActivity.ProdFee"));
		contractActivity8.setActivityId(_ctx.longValue("DescribePriceResponse.Order.DepreciateInfo.ContractActivity.ActivityId"));
		contractActivity8.setOptionCode(_ctx.stringValue("DescribePriceResponse.Order.DepreciateInfo.ContractActivity.OptionCode"));
		contractActivity8.setActivityName(_ctx.stringValue("DescribePriceResponse.Order.DepreciateInfo.ContractActivity.ActivityName"));

		List<Long> optionIds9 = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("DescribePriceResponse.Order.DepreciateInfo.ContractActivity.OptionIds.Length"); i++) {
			optionIds9.add(_ctx.longValue("DescribePriceResponse.Order.DepreciateInfo.ContractActivity.OptionIds["+ i +"]"));
		}
		contractActivity8.setOptionIds9(optionIds9);
		depreciateInfo5.setContractActivity8(contractActivity8);
		order.setDepreciateInfo5(depreciateInfo5);

		List<Coupon> coupons = new ArrayList<Coupon>();
		for (int i = 0; i < _ctx.lengthValue("DescribePriceResponse.Order.Coupons.Length"); i++) {
			Coupon coupon = new Coupon();
			coupon.setDescription(_ctx.stringValue("DescribePriceResponse.Order.Coupons["+ i +"].Description"));
			coupon.setIsSelected(_ctx.stringValue("DescribePriceResponse.Order.Coupons["+ i +"].IsSelected"));
			coupon.setCouponNo(_ctx.stringValue("DescribePriceResponse.Order.Coupons["+ i +"].CouponNo"));
			coupon.setName(_ctx.stringValue("DescribePriceResponse.Order.Coupons["+ i +"].Name"));
			coupon.setCanPromFee(_ctx.doubleValue("DescribePriceResponse.Order.Coupons["+ i +"].CanPromFee"));
			coupon.setPromotionOptionCode(_ctx.stringValue("DescribePriceResponse.Order.Coupons["+ i +"].PromotionOptionCode"));
			coupon.setLackForPriceBreak(_ctx.doubleValue("DescribePriceResponse.Order.Coupons["+ i +"].LackForPriceBreak"));
			coupon.setPriceBreakThreshold(_ctx.doubleValue("DescribePriceResponse.Order.Coupons["+ i +"].PriceBreakThreshold"));
			coupon.setPriceBreakReduceValue(_ctx.doubleValue("DescribePriceResponse.Order.Coupons["+ i +"].PriceBreakReduceValue"));
			coupon.setOptionCode(_ctx.stringValue("DescribePriceResponse.Order.Coupons["+ i +"].OptionCode"));
			coupon.setActivityCategory(_ctx.stringValue("DescribePriceResponse.Order.Coupons["+ i +"].ActivityCategory"));

			List<Long> promotionRuleIdList6 = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("DescribePriceResponse.Order.Coupons["+ i +"].PromotionRuleIdList.Length"); j++) {
				promotionRuleIdList6.add(_ctx.longValue("DescribePriceResponse.Order.Coupons["+ i +"].PromotionRuleIdList["+ j +"]"));
			}
			coupon.setPromotionRuleIdList6(promotionRuleIdList6);

			List<String> targetArticleItemCodes7 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribePriceResponse.Order.Coupons["+ i +"].TargetArticleItemCodes.Length"); j++) {
				targetArticleItemCodes7.add(_ctx.stringValue("DescribePriceResponse.Order.Coupons["+ i +"].TargetArticleItemCodes["+ j +"]"));
			}
			coupon.setTargetArticleItemCodes7(targetArticleItemCodes7);

			coupons.add(coupon);
		}
		order.setCoupons(coupons);
		describePriceResponse.setOrder(order);

		List<SubOrder> subOrders = new ArrayList<SubOrder>();
		for (int i = 0; i < _ctx.lengthValue("DescribePriceResponse.SubOrders.Length"); i++) {
			SubOrder subOrder = new SubOrder();
			subOrder.setOriginalAmount(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].OriginalAmount"));
			subOrder.setDiscountAmount(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].DiscountAmount"));
			subOrder.setTradeAmount(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].TradeAmount"));
			subOrder.setInstanceId(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].InstanceId"));
			subOrder.setIsNewOfficialActivity(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].IsNewOfficialActivity"));
			subOrder.setContractActivity(_ctx.booleanValue("DescribePriceResponse.SubOrders["+ i +"].ContractActivity"));
			subOrder.setStandDiscountPrice(_ctx.doubleValue("DescribePriceResponse.SubOrders["+ i +"].StandDiscountPrice"));
			subOrder.setStandPrice(_ctx.doubleValue("DescribePriceResponse.SubOrders["+ i +"].StandPrice"));
			subOrder.setIsContractActivity(_ctx.booleanValue("DescribePriceResponse.SubOrders["+ i +"].IsContractActivity"));

			List<String> ruleIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribePriceResponse.SubOrders["+ i +"].RuleIds.Length"); j++) {
				ruleIds.add(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].RuleIds["+ j +"]"));
			}
			subOrder.setRuleIds(ruleIds);

			DepreciateInfo depreciateInfo = new DepreciateInfo();
			depreciateInfo.setListPrice(_ctx.doubleValue("DescribePriceResponse.SubOrders["+ i +"].DepreciateInfo.ListPrice"));
			depreciateInfo.setOriginalStandAmount(_ctx.doubleValue("DescribePriceResponse.SubOrders["+ i +"].DepreciateInfo.OriginalStandAmount"));
			depreciateInfo.setCheapStandAmount(_ctx.doubleValue("DescribePriceResponse.SubOrders["+ i +"].DepreciateInfo.CheapStandAmount"));
			depreciateInfo.setCheapRate(_ctx.doubleValue("DescribePriceResponse.SubOrders["+ i +"].DepreciateInfo.CheapRate"));
			depreciateInfo.setDifferential(_ctx.doubleValue("DescribePriceResponse.SubOrders["+ i +"].DepreciateInfo.Differential"));
			depreciateInfo.setDifferentialName(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].DepreciateInfo.DifferentialName"));
			depreciateInfo.setMonthPrice(_ctx.doubleValue("DescribePriceResponse.SubOrders["+ i +"].DepreciateInfo.MonthPrice"));
			depreciateInfo.setIsContractActivity(_ctx.booleanValue("DescribePriceResponse.SubOrders["+ i +"].DepreciateInfo.IsContractActivity"));
			depreciateInfo.setIsShow(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].DepreciateInfo.IsShow"));
			depreciateInfo.setStartTime(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].DepreciateInfo.StartTime"));

			ContractActivity contractActivity = new ContractActivity();
			contractActivity.setFinalPromFee(_ctx.doubleValue("DescribePriceResponse.SubOrders["+ i +"].DepreciateInfo.ContractActivity.FinalPromFee"));
			contractActivity.setFinalFee(_ctx.doubleValue("DescribePriceResponse.SubOrders["+ i +"].DepreciateInfo.ContractActivity.FinalFee"));
			contractActivity.setProdFee(_ctx.doubleValue("DescribePriceResponse.SubOrders["+ i +"].DepreciateInfo.ContractActivity.ProdFee"));
			contractActivity.setActivityId(_ctx.longValue("DescribePriceResponse.SubOrders["+ i +"].DepreciateInfo.ContractActivity.ActivityId"));
			contractActivity.setOptionCode(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].DepreciateInfo.ContractActivity.OptionCode"));
			contractActivity.setActivityName(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].DepreciateInfo.ContractActivity.ActivityName"));

			List<Long> optionIds = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("DescribePriceResponse.SubOrders["+ i +"].DepreciateInfo.ContractActivity.OptionIds.Length"); j++) {
				optionIds.add(_ctx.longValue("DescribePriceResponse.SubOrders["+ i +"].DepreciateInfo.ContractActivity.OptionIds["+ j +"]"));
			}
			contractActivity.setOptionIds(optionIds);
			depreciateInfo.setContractActivity(contractActivity);
			subOrder.setDepreciateInfo(depreciateInfo);

			List<ModuleInstanceItem> moduleInstance = new ArrayList<ModuleInstanceItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance.Length"); j++) {
				ModuleInstanceItem moduleInstanceItem = new ModuleInstanceItem();
				moduleInstanceItem.setCycleFee(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].CycleFee"));
				moduleInstanceItem.setDiscountFee(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].DiscountFee"));
				moduleInstanceItem.setModuleCode(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].ModuleCode"));
				moduleInstanceItem.setModuleId(_ctx.longValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].ModuleId"));
				moduleInstanceItem.setModuleName(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].ModuleName"));
				moduleInstanceItem.setNeedOrderPay(_ctx.booleanValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].NeedOrderPay"));
				moduleInstanceItem.setPayFee(_ctx.doubleValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].PayFee"));
				moduleInstanceItem.setPricingModule(_ctx.booleanValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].PricingModule"));
				moduleInstanceItem.setStandPrice(_ctx.doubleValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].StandPrice"));
				moduleInstanceItem.setTotalProductFee(_ctx.doubleValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].TotalProductFee"));
				moduleInstanceItem.setContractActivity(_ctx.booleanValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].ContractActivity"));
				moduleInstanceItem.setStandDiscountPrice(_ctx.doubleValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].StandDiscountPrice"));
				moduleInstanceItem.setPriceUnit(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].priceUnit"));
				moduleInstanceItem.setPriceType(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].priceType"));
				moduleInstanceItem.setUnitPriceUnit4Buy(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].UnitPriceUnit4Buy"));

				DepreciateInfo1 depreciateInfo1 = new DepreciateInfo1();
				depreciateInfo1.setListPrice(_ctx.doubleValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].DepreciateInfo.ListPrice"));
				depreciateInfo1.setOriginalStandAmount(_ctx.doubleValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].DepreciateInfo.OriginalStandAmount"));
				depreciateInfo1.setCheapStandAmount(_ctx.doubleValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].DepreciateInfo.CheapStandAmount"));
				depreciateInfo1.setCheapRate(_ctx.doubleValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].DepreciateInfo.CheapRate"));
				depreciateInfo1.setDifferential(_ctx.doubleValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].DepreciateInfo.Differential"));
				depreciateInfo1.setDifferentialName(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].DepreciateInfo.DifferentialName"));
				depreciateInfo1.setMonthPrice(_ctx.doubleValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].DepreciateInfo.MonthPrice"));
				depreciateInfo1.setIsContractActivity(_ctx.booleanValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].DepreciateInfo.IsContractActivity"));
				depreciateInfo1.setIsShow(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].DepreciateInfo.IsShow"));
				moduleInstanceItem.setDepreciateInfo1(depreciateInfo1);

				List<PromDetail> promDetailList2 = new ArrayList<PromDetail>();
				for (int k = 0; k < _ctx.lengthValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].PromDetailList.Length"); k++) {
					PromDetail promDetail = new PromDetail();
					promDetail.setFinalPromFee(_ctx.doubleValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].PromDetailList["+ k +"].FinalPromFee"));
					promDetail.setActivityExtInfo(_ctx.mapValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].PromDetailList["+ k +"].ActivityExtInfo"));
					promDetail.setOptionCode(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].PromDetailList["+ k +"].OptionCode"));
					promDetail.setPromType(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].PromDetailList["+ k +"].PromType"));
					promDetail.setPromotionId(_ctx.longValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].PromDetailList["+ k +"].PromotionId"));
					promDetail.setPromotionName(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].PromDetailList["+ k +"].PromotionName"));
					promDetail.setPromotionCode(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].PromDetailList["+ k +"].PromotionCode"));
					promDetail.setDerivedPromType(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].PromDetailList["+ k +"].DerivedPromType"));

					promDetailList2.add(promDetail);
				}
				moduleInstanceItem.setPromDetailList2(promDetailList2);

				List<ModuleAttr> moduleAttrs = new ArrayList<ModuleAttr>();
				for (int k = 0; k < _ctx.lengthValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].ModuleAttrs.Length"); k++) {
					ModuleAttr moduleAttr = new ModuleAttr();
					moduleAttr.setCode(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].ModuleAttrs["+ k +"].Code"));
					moduleAttr.setName(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].ModuleAttrs["+ k +"].Name"));
					moduleAttr.setType(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].ModuleAttrs["+ k +"].Type"));
					moduleAttr.setValue(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].ModuleAttrs["+ k +"].Value"));

					moduleAttrs.add(moduleAttr);
				}
				moduleInstanceItem.setModuleAttrs(moduleAttrs);

				moduleInstance.add(moduleInstanceItem);
			}
			subOrder.setModuleInstance(moduleInstance);

			List<OptionalPromotion> optionalPromotions = new ArrayList<OptionalPromotion>();
			for (int j = 0; j < _ctx.lengthValue("DescribePriceResponse.SubOrders["+ i +"].OptionalPromotions.Length"); j++) {
				OptionalPromotion optionalPromotion = new OptionalPromotion();
				optionalPromotion.setActivityCategory(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].OptionalPromotions["+ j +"].ActivityCategory"));
				optionalPromotion.setActivityExtInfo(_ctx.mapValue("DescribePriceResponse.SubOrders["+ i +"].OptionalPromotions["+ j +"].ActivityExtInfo"));
				optionalPromotion.setCanPromFee(_ctx.doubleValue("DescribePriceResponse.SubOrders["+ i +"].OptionalPromotions["+ j +"].CanPromFee"));
				optionalPromotion.setOptionCode(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].OptionalPromotions["+ j +"].OptionCode"));
				optionalPromotion.setPromotionName(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].OptionalPromotions["+ j +"].PromotionName"));
				optionalPromotion.setPromotionOptionNo(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].OptionalPromotions["+ j +"].PromotionOptionNo"));
				optionalPromotion.setSelected(_ctx.booleanValue("DescribePriceResponse.SubOrders["+ i +"].OptionalPromotions["+ j +"].Selected"));
				optionalPromotion.setShow(_ctx.booleanValue("DescribePriceResponse.SubOrders["+ i +"].OptionalPromotions["+ j +"].Show"));

				List<String> targetArticleItemCodes = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribePriceResponse.SubOrders["+ i +"].OptionalPromotions["+ j +"].TargetArticleItemCodes.Length"); k++) {
					targetArticleItemCodes.add(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].OptionalPromotions["+ j +"].TargetArticleItemCodes["+ k +"]"));
				}
				optionalPromotion.setTargetArticleItemCodes(targetArticleItemCodes);

				List<String> promotionRuleIdList = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribePriceResponse.SubOrders["+ i +"].OptionalPromotions["+ j +"].PromotionRuleIdList.Length"); k++) {
					promotionRuleIdList.add(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].OptionalPromotions["+ j +"].PromotionRuleIdList["+ k +"]"));
				}
				optionalPromotion.setPromotionRuleIdList(promotionRuleIdList);

				optionalPromotions.add(optionalPromotion);
			}
			subOrder.setOptionalPromotions(optionalPromotions);

			List<PromDetail3> promDetailList = new ArrayList<PromDetail3>();
			for (int j = 0; j < _ctx.lengthValue("DescribePriceResponse.SubOrders["+ i +"].PromDetailList.Length"); j++) {
				PromDetail3 promDetail3 = new PromDetail3();
				promDetail3.setFinalPromFee(_ctx.doubleValue("DescribePriceResponse.SubOrders["+ i +"].PromDetailList["+ j +"].FinalPromFee"));
				promDetail3.setActivityExtInfo(_ctx.mapValue("DescribePriceResponse.SubOrders["+ i +"].PromDetailList["+ j +"].ActivityExtInfo"));
				promDetail3.setOptionCode(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].PromDetailList["+ j +"].OptionCode"));
				promDetail3.setPromType(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].PromDetailList["+ j +"].PromType"));
				promDetail3.setPromotionId(_ctx.longValue("DescribePriceResponse.SubOrders["+ i +"].PromDetailList["+ j +"].PromotionId"));
				promDetail3.setPromotionName(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].PromDetailList["+ j +"].PromotionName"));
				promDetail3.setPromotionCode(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].PromDetailList["+ j +"].PromotionCode"));
				promDetail3.setDerivedPromType(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].PromDetailList["+ j +"].DerivedPromType"));

				promDetailList.add(promDetail3);
			}
			subOrder.setPromDetailList(promDetailList);

			subOrders.add(subOrder);
		}
		describePriceResponse.setSubOrders(subOrders);

		List<Rule> rules = new ArrayList<Rule>();
		for (int i = 0; i < _ctx.lengthValue("DescribePriceResponse.Rules.Length"); i++) {
			Rule rule = new Rule();
			rule.setRuleDescId(_ctx.longValue("DescribePriceResponse.Rules["+ i +"].RuleDescId"));
			rule.setTitle(_ctx.stringValue("DescribePriceResponse.Rules["+ i +"].Title"));
			rule.setName(_ctx.stringValue("DescribePriceResponse.Rules["+ i +"].Name"));

			rules.add(rule);
		}
		describePriceResponse.setRules(rules);
	 
	 	return describePriceResponse;
	}
}