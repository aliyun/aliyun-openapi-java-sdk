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
import com.aliyuncs.dds.model.v20151201.DescribePriceResponse.SubOrder.ModuleInstanceItem.PromDetail3;
import com.aliyuncs.dds.model.v20151201.DescribePriceResponse.SubOrder.OptionalPromotion;
import com.aliyuncs.dds.model.v20151201.DescribePriceResponse.SubOrder.PromDetail;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePriceResponseUnmarshaller {

	public static DescribePriceResponse unmarshall(DescribePriceResponse describePriceResponse, UnmarshallerContext _ctx) {
		
		describePriceResponse.setRequestId(_ctx.stringValue("DescribePriceResponse.RequestId"));
		describePriceResponse.setTraceId(_ctx.stringValue("DescribePriceResponse.TraceId"));
		describePriceResponse.setOrderParams(_ctx.stringValue("DescribePriceResponse.OrderParams"));

		Order order = new Order();
		order.setStandPrice(_ctx.doubleValue("DescribePriceResponse.Order.StandPrice"));
		order.setShowDiscountInfo(_ctx.booleanValue("DescribePriceResponse.Order.ShowDiscountInfo"));
		order.setMessage(_ctx.stringValue("DescribePriceResponse.Order.Message"));
		order.setStandDiscountPrice(_ctx.doubleValue("DescribePriceResponse.Order.StandDiscountPrice"));
		order.setTradeAmount(_ctx.stringValue("DescribePriceResponse.Order.TradeAmount"));
		order.setOriginalAmount(_ctx.stringValue("DescribePriceResponse.Order.OriginalAmount"));
		order.setCode(_ctx.stringValue("DescribePriceResponse.Order.Code"));
		order.setDiscountAmount(_ctx.stringValue("DescribePriceResponse.Order.DiscountAmount"));
		order.setContractActivity(_ctx.booleanValue("DescribePriceResponse.Order.ContractActivity"));
		order.setOptionalPromotions(_ctx.stringValue("DescribePriceResponse.Order.OptionalPromotions"));
		order.setCurrency(_ctx.stringValue("DescribePriceResponse.Order.Currency"));
		order.setPromDetailList(_ctx.stringValue("DescribePriceResponse.Order.PromDetailList"));
		order.setTotalCostAmount(_ctx.doubleValue("DescribePriceResponse.Order.TotalCostAmount"));
		order.setIsContractActivity(_ctx.booleanValue("DescribePriceResponse.Order.IsContractActivity"));

		List<String> ruleIds4 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribePriceResponse.Order.RuleIds.Length"); i++) {
			ruleIds4.add(_ctx.stringValue("DescribePriceResponse.Order.RuleIds["+ i +"]"));
		}
		order.setRuleIds4(ruleIds4);

		DepreciateInfo5 depreciateInfo5 = new DepreciateInfo5();
		depreciateInfo5.setCheapRate(_ctx.doubleValue("DescribePriceResponse.Order.DepreciateInfo.CheapRate"));
		depreciateInfo5.setDifferential(_ctx.doubleValue("DescribePriceResponse.Order.DepreciateInfo.Differential"));
		depreciateInfo5.setDifferentialName(_ctx.stringValue("DescribePriceResponse.Order.DepreciateInfo.DifferentialName"));
		depreciateInfo5.setMonthPrice(_ctx.doubleValue("DescribePriceResponse.Order.DepreciateInfo.MonthPrice"));
		depreciateInfo5.setCheapStandAmount(_ctx.doubleValue("DescribePriceResponse.Order.DepreciateInfo.CheapStandAmount"));
		depreciateInfo5.setOriginalStandAmount(_ctx.doubleValue("DescribePriceResponse.Order.DepreciateInfo.OriginalStandAmount"));
		depreciateInfo5.setIsShow(_ctx.stringValue("DescribePriceResponse.Order.DepreciateInfo.IsShow"));
		depreciateInfo5.setListPrice(_ctx.doubleValue("DescribePriceResponse.Order.DepreciateInfo.ListPrice"));
		depreciateInfo5.setIsContractActivity(_ctx.booleanValue("DescribePriceResponse.Order.DepreciateInfo.IsContractActivity"));

		ContractActivity8 contractActivity8 = new ContractActivity8();
		contractActivity8.setActivityName(_ctx.stringValue("DescribePriceResponse.Order.DepreciateInfo.ContractActivity.ActivityName"));
		contractActivity8.setFinalPromFee(_ctx.doubleValue("DescribePriceResponse.Order.DepreciateInfo.ContractActivity.FinalPromFee"));
		contractActivity8.setActivityId(_ctx.longValue("DescribePriceResponse.Order.DepreciateInfo.ContractActivity.ActivityId"));
		contractActivity8.setProdFee(_ctx.doubleValue("DescribePriceResponse.Order.DepreciateInfo.ContractActivity.ProdFee"));
		contractActivity8.setOptionCode(_ctx.stringValue("DescribePriceResponse.Order.DepreciateInfo.ContractActivity.OptionCode"));
		contractActivity8.setFinalFee(_ctx.doubleValue("DescribePriceResponse.Order.DepreciateInfo.ContractActivity.FinalFee"));

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
			coupon.setCouponNo(_ctx.stringValue("DescribePriceResponse.Order.Coupons["+ i +"].CouponNo"));
			coupon.setActivityCategory(_ctx.stringValue("DescribePriceResponse.Order.Coupons["+ i +"].ActivityCategory"));
			coupon.setDescription(_ctx.stringValue("DescribePriceResponse.Order.Coupons["+ i +"].Description"));
			coupon.setPriceBreakReduceValue(_ctx.doubleValue("DescribePriceResponse.Order.Coupons["+ i +"].PriceBreakReduceValue"));
			coupon.setCanPromFee(_ctx.doubleValue("DescribePriceResponse.Order.Coupons["+ i +"].CanPromFee"));
			coupon.setPromotionOptionCode(_ctx.stringValue("DescribePriceResponse.Order.Coupons["+ i +"].PromotionOptionCode"));
			coupon.setIsSelected(_ctx.stringValue("DescribePriceResponse.Order.Coupons["+ i +"].IsSelected"));
			coupon.setActivityExtInfo(_ctx.mapValue("DescribePriceResponse.Order.Coupons["+ i +"].ActivityExtInfo"));
			coupon.setOptionCode(_ctx.stringValue("DescribePriceResponse.Order.Coupons["+ i +"].OptionCode"));
			coupon.setName(_ctx.stringValue("DescribePriceResponse.Order.Coupons["+ i +"].Name"));
			coupon.setEffective(_ctx.booleanValue("DescribePriceResponse.Order.Coupons["+ i +"].Effective"));
			coupon.setPriceBreakThreshold(_ctx.doubleValue("DescribePriceResponse.Order.Coupons["+ i +"].PriceBreakThreshold"));
			coupon.setLackForPriceBreak(_ctx.doubleValue("DescribePriceResponse.Order.Coupons["+ i +"].LackForPriceBreak"));

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
			subOrder.setStandPrice(_ctx.doubleValue("DescribePriceResponse.SubOrders["+ i +"].StandPrice"));
			subOrder.setInstanceId(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].InstanceId"));
			subOrder.setStandDiscountPrice(_ctx.doubleValue("DescribePriceResponse.SubOrders["+ i +"].StandDiscountPrice"));
			subOrder.setTradeAmount(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].TradeAmount"));
			subOrder.setOriginalAmount(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].OriginalAmount"));
			subOrder.setDiscountAmount(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].DiscountAmount"));
			subOrder.setContractActivity(_ctx.booleanValue("DescribePriceResponse.SubOrders["+ i +"].ContractActivity"));
			subOrder.setIsNewOfficialActivity(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].IsNewOfficialActivity"));
			subOrder.setIsContractActivity(_ctx.booleanValue("DescribePriceResponse.SubOrders["+ i +"].IsContractActivity"));

			List<String> ruleIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribePriceResponse.SubOrders["+ i +"].RuleIds.Length"); j++) {
				ruleIds.add(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].RuleIds["+ j +"]"));
			}
			subOrder.setRuleIds(ruleIds);

			DepreciateInfo depreciateInfo = new DepreciateInfo();
			depreciateInfo.setCheapRate(_ctx.doubleValue("DescribePriceResponse.SubOrders["+ i +"].DepreciateInfo.CheapRate"));
			depreciateInfo.setDifferential(_ctx.doubleValue("DescribePriceResponse.SubOrders["+ i +"].DepreciateInfo.Differential"));
			depreciateInfo.setDifferentialName(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].DepreciateInfo.DifferentialName"));
			depreciateInfo.setMonthPrice(_ctx.doubleValue("DescribePriceResponse.SubOrders["+ i +"].DepreciateInfo.MonthPrice"));
			depreciateInfo.setCheapStandAmount(_ctx.doubleValue("DescribePriceResponse.SubOrders["+ i +"].DepreciateInfo.CheapStandAmount"));
			depreciateInfo.setStartTime(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].DepreciateInfo.StartTime"));
			depreciateInfo.setOriginalStandAmount(_ctx.doubleValue("DescribePriceResponse.SubOrders["+ i +"].DepreciateInfo.OriginalStandAmount"));
			depreciateInfo.setIsShow(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].DepreciateInfo.IsShow"));
			depreciateInfo.setListPrice(_ctx.doubleValue("DescribePriceResponse.SubOrders["+ i +"].DepreciateInfo.ListPrice"));
			depreciateInfo.setIsContractActivity(_ctx.booleanValue("DescribePriceResponse.SubOrders["+ i +"].DepreciateInfo.IsContractActivity"));

			ContractActivity contractActivity = new ContractActivity();
			contractActivity.setActivityName(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].DepreciateInfo.ContractActivity.ActivityName"));
			contractActivity.setFinalPromFee(_ctx.doubleValue("DescribePriceResponse.SubOrders["+ i +"].DepreciateInfo.ContractActivity.FinalPromFee"));
			contractActivity.setActivityId(_ctx.longValue("DescribePriceResponse.SubOrders["+ i +"].DepreciateInfo.ContractActivity.ActivityId"));
			contractActivity.setProdFee(_ctx.doubleValue("DescribePriceResponse.SubOrders["+ i +"].DepreciateInfo.ContractActivity.ProdFee"));
			contractActivity.setOptionCode(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].DepreciateInfo.ContractActivity.OptionCode"));
			contractActivity.setFinalFee(_ctx.doubleValue("DescribePriceResponse.SubOrders["+ i +"].DepreciateInfo.ContractActivity.FinalFee"));

			List<Long> optionIds = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("DescribePriceResponse.SubOrders["+ i +"].DepreciateInfo.ContractActivity.OptionIds.Length"); j++) {
				optionIds.add(_ctx.longValue("DescribePriceResponse.SubOrders["+ i +"].DepreciateInfo.ContractActivity.OptionIds["+ j +"]"));
			}
			contractActivity.setOptionIds(optionIds);
			depreciateInfo.setContractActivity(contractActivity);
			subOrder.setDepreciateInfo(depreciateInfo);

			List<OptionalPromotion> optionalPromotions = new ArrayList<OptionalPromotion>();
			for (int j = 0; j < _ctx.lengthValue("DescribePriceResponse.SubOrders["+ i +"].OptionalPromotions.Length"); j++) {
				OptionalPromotion optionalPromotion = new OptionalPromotion();
				optionalPromotion.setActivityCategory(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].OptionalPromotions["+ j +"].ActivityCategory"));
				optionalPromotion.setPromotionName(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].OptionalPromotions["+ j +"].PromotionName"));
				optionalPromotion.setPromotionOptionNo(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].OptionalPromotions["+ j +"].PromotionOptionNo"));
				optionalPromotion.setCanPromFee(_ctx.doubleValue("DescribePriceResponse.SubOrders["+ i +"].OptionalPromotions["+ j +"].CanPromFee"));
				optionalPromotion.setActivityExtInfo(_ctx.mapValue("DescribePriceResponse.SubOrders["+ i +"].OptionalPromotions["+ j +"].ActivityExtInfo"));
				optionalPromotion.setShow(_ctx.booleanValue("DescribePriceResponse.SubOrders["+ i +"].OptionalPromotions["+ j +"].Show"));
				optionalPromotion.setOptionCode(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].OptionalPromotions["+ j +"].OptionCode"));
				optionalPromotion.setSelected(_ctx.booleanValue("DescribePriceResponse.SubOrders["+ i +"].OptionalPromotions["+ j +"].Selected"));

				List<String> promotionRuleIdList = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribePriceResponse.SubOrders["+ i +"].OptionalPromotions["+ j +"].PromotionRuleIdList.Length"); k++) {
					promotionRuleIdList.add(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].OptionalPromotions["+ j +"].PromotionRuleIdList["+ k +"]"));
				}
				optionalPromotion.setPromotionRuleIdList(promotionRuleIdList);

				List<String> targetArticleItemCodes = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribePriceResponse.SubOrders["+ i +"].OptionalPromotions["+ j +"].TargetArticleItemCodes.Length"); k++) {
					targetArticleItemCodes.add(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].OptionalPromotions["+ j +"].TargetArticleItemCodes["+ k +"]"));
				}
				optionalPromotion.setTargetArticleItemCodes(targetArticleItemCodes);

				optionalPromotions.add(optionalPromotion);
			}
			subOrder.setOptionalPromotions(optionalPromotions);

			List<PromDetail> promDetailList = new ArrayList<PromDetail>();
			for (int j = 0; j < _ctx.lengthValue("DescribePriceResponse.SubOrders["+ i +"].PromDetailList.Length"); j++) {
				PromDetail promDetail = new PromDetail();
				promDetail.setPromotionName(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].PromDetailList["+ j +"].PromotionName"));
				promDetail.setDerivedPromType(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].PromDetailList["+ j +"].DerivedPromType"));
				promDetail.setPromotionId(_ctx.longValue("DescribePriceResponse.SubOrders["+ i +"].PromDetailList["+ j +"].PromotionId"));
				promDetail.setFinalPromFee(_ctx.doubleValue("DescribePriceResponse.SubOrders["+ i +"].PromDetailList["+ j +"].FinalPromFee"));
				promDetail.setPromotionCode(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].PromDetailList["+ j +"].PromotionCode"));
				promDetail.setActivityExtInfo(_ctx.mapValue("DescribePriceResponse.SubOrders["+ i +"].PromDetailList["+ j +"].ActivityExtInfo"));
				promDetail.setOptionCode(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].PromDetailList["+ j +"].OptionCode"));
				promDetail.setPromType(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].PromDetailList["+ j +"].PromType"));

				promDetailList.add(promDetail);
			}
			subOrder.setPromDetailList(promDetailList);

			List<ModuleInstanceItem> moduleInstance = new ArrayList<ModuleInstanceItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance.Length"); j++) {
				ModuleInstanceItem moduleInstanceItem = new ModuleInstanceItem();
				moduleInstanceItem.setStandPrice(_ctx.doubleValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].StandPrice"));
				moduleInstanceItem.setPriceUnit(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].priceUnit"));
				moduleInstanceItem.setModuleName(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].ModuleName"));
				moduleInstanceItem.setStandDiscountPrice(_ctx.doubleValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].StandDiscountPrice"));
				moduleInstanceItem.setPriceType(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].priceType"));
				moduleInstanceItem.setDiscountFee(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].DiscountFee"));
				moduleInstanceItem.setNeedOrderPay(_ctx.booleanValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].NeedOrderPay"));
				moduleInstanceItem.setPayFee(_ctx.doubleValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].PayFee"));
				moduleInstanceItem.setContractActivity(_ctx.booleanValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].ContractActivity"));
				moduleInstanceItem.setCycleFee(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].CycleFee"));
				moduleInstanceItem.setModuleId(_ctx.longValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].ModuleId"));
				moduleInstanceItem.setPricingModule(_ctx.booleanValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].PricingModule"));
				moduleInstanceItem.setModuleCode(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].ModuleCode"));
				moduleInstanceItem.setUnitPriceUnit4Buy(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].UnitPriceUnit4Buy"));
				moduleInstanceItem.setTotalProductFee(_ctx.doubleValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].TotalProductFee"));

				DepreciateInfo1 depreciateInfo1 = new DepreciateInfo1();
				depreciateInfo1.setCheapRate(_ctx.doubleValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].DepreciateInfo.CheapRate"));
				depreciateInfo1.setDifferential(_ctx.doubleValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].DepreciateInfo.Differential"));
				depreciateInfo1.setDifferentialName(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].DepreciateInfo.DifferentialName"));
				depreciateInfo1.setMonthPrice(_ctx.doubleValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].DepreciateInfo.MonthPrice"));
				depreciateInfo1.setCheapStandAmount(_ctx.doubleValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].DepreciateInfo.CheapStandAmount"));
				depreciateInfo1.setOriginalStandAmount(_ctx.doubleValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].DepreciateInfo.OriginalStandAmount"));
				depreciateInfo1.setIsShow(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].DepreciateInfo.IsShow"));
				depreciateInfo1.setListPrice(_ctx.doubleValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].DepreciateInfo.ListPrice"));
				depreciateInfo1.setIsContractActivity(_ctx.booleanValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].DepreciateInfo.IsContractActivity"));
				moduleInstanceItem.setDepreciateInfo1(depreciateInfo1);

				List<PromDetail3> promDetailList2 = new ArrayList<PromDetail3>();
				for (int k = 0; k < _ctx.lengthValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].PromDetailList.Length"); k++) {
					PromDetail3 promDetail3 = new PromDetail3();
					promDetail3.setPromotionName(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].PromDetailList["+ k +"].PromotionName"));
					promDetail3.setDerivedPromType(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].PromDetailList["+ k +"].DerivedPromType"));
					promDetail3.setPromotionId(_ctx.longValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].PromDetailList["+ k +"].PromotionId"));
					promDetail3.setFinalPromFee(_ctx.doubleValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].PromDetailList["+ k +"].FinalPromFee"));
					promDetail3.setPromotionCode(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].PromDetailList["+ k +"].PromotionCode"));
					promDetail3.setActivityExtInfo(_ctx.mapValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].PromDetailList["+ k +"].ActivityExtInfo"));
					promDetail3.setOptionCode(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].PromDetailList["+ k +"].OptionCode"));
					promDetail3.setPromType(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].PromDetailList["+ k +"].PromType"));

					promDetailList2.add(promDetail3);
				}
				moduleInstanceItem.setPromDetailList2(promDetailList2);

				List<ModuleAttr> moduleAttrs = new ArrayList<ModuleAttr>();
				for (int k = 0; k < _ctx.lengthValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].ModuleAttrs.Length"); k++) {
					ModuleAttr moduleAttr = new ModuleAttr();
					moduleAttr.setType(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].ModuleAttrs["+ k +"].Type"));
					moduleAttr.setValue(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].ModuleAttrs["+ k +"].Value"));
					moduleAttr.setCode(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].ModuleAttrs["+ k +"].Code"));
					moduleAttr.setName(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].ModuleAttrs["+ k +"].Name"));

					moduleAttrs.add(moduleAttr);
				}
				moduleInstanceItem.setModuleAttrs(moduleAttrs);

				moduleInstance.add(moduleInstanceItem);
			}
			subOrder.setModuleInstance(moduleInstance);

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