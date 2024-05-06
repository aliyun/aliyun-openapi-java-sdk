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

package com.aliyuncs.r_kvstore.transform.v20150101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.r_kvstore.model.v20150101.DescribePriceResponse;
import com.aliyuncs.r_kvstore.model.v20150101.DescribePriceResponse.Order;
import com.aliyuncs.r_kvstore.model.v20150101.DescribePriceResponse.Order.Coupon;
import com.aliyuncs.r_kvstore.model.v20150101.DescribePriceResponse.Order.DepreciateInfo3;
import com.aliyuncs.r_kvstore.model.v20150101.DescribePriceResponse.Order.DepreciateInfo3.ContractActivity4;
import com.aliyuncs.r_kvstore.model.v20150101.DescribePriceResponse.Rule;
import com.aliyuncs.r_kvstore.model.v20150101.DescribePriceResponse.SubOrder;
import com.aliyuncs.r_kvstore.model.v20150101.DescribePriceResponse.SubOrder.DepreciateInfo;
import com.aliyuncs.r_kvstore.model.v20150101.DescribePriceResponse.SubOrder.DepreciateInfo.ContractActivity;
import com.aliyuncs.r_kvstore.model.v20150101.DescribePriceResponse.SubOrder.ModuleInstanceItem;
import com.aliyuncs.r_kvstore.model.v20150101.DescribePriceResponse.SubOrder.ModuleInstanceItem.DepreciateInfo1;
import com.aliyuncs.r_kvstore.model.v20150101.DescribePriceResponse.SubOrder.ModuleInstanceItem.ModuleAttr;
import com.aliyuncs.r_kvstore.model.v20150101.DescribePriceResponse.SubOrder.OptionalPromotion;
import com.aliyuncs.r_kvstore.model.v20150101.DescribePriceResponse.SubOrder.PromDetail;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePriceResponseUnmarshaller {

	public static DescribePriceResponse unmarshall(DescribePriceResponse describePriceResponse, UnmarshallerContext _ctx) {
		
		describePriceResponse.setRequestId(_ctx.stringValue("DescribePriceResponse.RequestId"));
		describePriceResponse.setOrderParams(_ctx.stringValue("DescribePriceResponse.OrderParams"));

		Order order = new Order();
		order.setOriginalAmount(_ctx.stringValue("DescribePriceResponse.Order.OriginalAmount"));
		order.setHandlingFeeAmount(_ctx.stringValue("DescribePriceResponse.Order.HandlingFeeAmount"));
		order.setCurrency(_ctx.stringValue("DescribePriceResponse.Order.Currency"));
		order.setDiscountAmount(_ctx.stringValue("DescribePriceResponse.Order.DiscountAmount"));
		order.setTradeAmount(_ctx.stringValue("DescribePriceResponse.Order.TradeAmount"));
		order.setShowDiscountInfo(_ctx.booleanValue("DescribePriceResponse.Order.ShowDiscountInfo"));
		order.setStandDiscountPrice(_ctx.longValue("DescribePriceResponse.Order.StandDiscountPrice"));
		order.setIsContractActivity(_ctx.booleanValue("DescribePriceResponse.Order.IsContractActivity"));
		order.setStandPrice(_ctx.longValue("DescribePriceResponse.Order.StandPrice"));
		order.setCode(_ctx.stringValue("DescribePriceResponse.Order.Code"));
		order.setMessage(_ctx.stringValue("DescribePriceResponse.Order.Message"));

		List<String> ruleIds2 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribePriceResponse.Order.RuleIds.Length"); i++) {
			ruleIds2.add(_ctx.stringValue("DescribePriceResponse.Order.RuleIds["+ i +"]"));
		}
		order.setRuleIds2(ruleIds2);

		DepreciateInfo3 depreciateInfo3 = new DepreciateInfo3();
		depreciateInfo3.setListPrice(_ctx.longValue("DescribePriceResponse.Order.DepreciateInfo.ListPrice"));
		depreciateInfo3.setOriginalStandAmount(_ctx.longValue("DescribePriceResponse.Order.DepreciateInfo.OriginalStandAmount"));
		depreciateInfo3.setCheapStandAmount(_ctx.longValue("DescribePriceResponse.Order.DepreciateInfo.CheapStandAmount"));
		depreciateInfo3.setCheapRate(_ctx.longValue("DescribePriceResponse.Order.DepreciateInfo.CheapRate"));
		depreciateInfo3.setDifferential(_ctx.longValue("DescribePriceResponse.Order.DepreciateInfo.Differential"));
		depreciateInfo3.setDifferentialName(_ctx.stringValue("DescribePriceResponse.Order.DepreciateInfo.DifferentialName"));
		depreciateInfo3.setMonthPrice(_ctx.longValue("DescribePriceResponse.Order.DepreciateInfo.MonthPrice"));
		depreciateInfo3.setIsContractActivity(_ctx.booleanValue("DescribePriceResponse.Order.DepreciateInfo.IsContractActivity"));
		depreciateInfo3.setIsShow(_ctx.booleanValue("DescribePriceResponse.Order.DepreciateInfo.IsShow"));

		ContractActivity4 contractActivity4 = new ContractActivity4();
		contractActivity4.setFinalPromFee(_ctx.doubleValue("DescribePriceResponse.Order.DepreciateInfo.ContractActivity.FinalPromFee"));
		contractActivity4.setFinalFee(_ctx.doubleValue("DescribePriceResponse.Order.DepreciateInfo.ContractActivity.FinalFee"));
		contractActivity4.setProdFee(_ctx.doubleValue("DescribePriceResponse.Order.DepreciateInfo.ContractActivity.ProdFee"));
		contractActivity4.setActivityId(_ctx.longValue("DescribePriceResponse.Order.DepreciateInfo.ContractActivity.ActivityId"));
		contractActivity4.setOptionCode(_ctx.stringValue("DescribePriceResponse.Order.DepreciateInfo.ContractActivity.OptionCode"));
		contractActivity4.setActivityName(_ctx.stringValue("DescribePriceResponse.Order.DepreciateInfo.ContractActivity.ActivityName"));

		List<Long> optionIds5 = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("DescribePriceResponse.Order.DepreciateInfo.ContractActivity.OptionIds.Length"); i++) {
			optionIds5.add(_ctx.longValue("DescribePriceResponse.Order.DepreciateInfo.ContractActivity.OptionIds["+ i +"]"));
		}
		contractActivity4.setOptionIds5(optionIds5);
		depreciateInfo3.setContractActivity4(contractActivity4);
		order.setDepreciateInfo3(depreciateInfo3);

		List<Coupon> coupons = new ArrayList<Coupon>();
		for (int i = 0; i < _ctx.lengthValue("DescribePriceResponse.Order.Coupons.Length"); i++) {
			Coupon coupon = new Coupon();
			coupon.setIsSelected(_ctx.stringValue("DescribePriceResponse.Order.Coupons["+ i +"].IsSelected"));
			coupon.setCouponNo(_ctx.stringValue("DescribePriceResponse.Order.Coupons["+ i +"].CouponNo"));
			coupon.setName(_ctx.stringValue("DescribePriceResponse.Order.Coupons["+ i +"].Name"));
			coupon.setDescription(_ctx.stringValue("DescribePriceResponse.Order.Coupons["+ i +"].Description"));

			coupons.add(coupon);
		}
		order.setCoupons(coupons);
		describePriceResponse.setOrder(order);

		List<Rule> rules = new ArrayList<Rule>();
		for (int i = 0; i < _ctx.lengthValue("DescribePriceResponse.Rules.Length"); i++) {
			Rule rule = new Rule();
			rule.setRuleDescId(_ctx.longValue("DescribePriceResponse.Rules["+ i +"].RuleDescId"));
			rule.setTitle(_ctx.stringValue("DescribePriceResponse.Rules["+ i +"].Title"));
			rule.setName(_ctx.stringValue("DescribePriceResponse.Rules["+ i +"].Name"));

			rules.add(rule);
		}
		describePriceResponse.setRules(rules);

		List<SubOrder> subOrders = new ArrayList<SubOrder>();
		for (int i = 0; i < _ctx.lengthValue("DescribePriceResponse.SubOrders.Length"); i++) {
			SubOrder subOrder = new SubOrder();
			subOrder.setOriginalAmount(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].OriginalAmount"));
			subOrder.setInstanceId(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].InstanceId"));
			subOrder.setDiscountAmount(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].DiscountAmount"));
			subOrder.setTradeAmount(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].TradeAmount"));
			subOrder.setStandDiscountPrice(_ctx.longValue("DescribePriceResponse.SubOrders["+ i +"].StandDiscountPrice"));
			subOrder.setIsContractActivity(_ctx.booleanValue("DescribePriceResponse.SubOrders["+ i +"].IsContractActivity"));
			subOrder.setStandPrice(_ctx.longValue("DescribePriceResponse.SubOrders["+ i +"].StandPrice"));
			subOrder.setContractActivity(_ctx.booleanValue("DescribePriceResponse.SubOrders["+ i +"].ContractActivity"));

			List<String> ruleIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribePriceResponse.SubOrders["+ i +"].RuleIds.Length"); j++) {
				ruleIds.add(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].RuleIds["+ j +"]"));
			}
			subOrder.setRuleIds(ruleIds);

			DepreciateInfo depreciateInfo = new DepreciateInfo();
			depreciateInfo.setListPrice(_ctx.longValue("DescribePriceResponse.SubOrders["+ i +"].DepreciateInfo.ListPrice"));
			depreciateInfo.setOriginalStandAmount(_ctx.longValue("DescribePriceResponse.SubOrders["+ i +"].DepreciateInfo.OriginalStandAmount"));
			depreciateInfo.setCheapStandAmount(_ctx.longValue("DescribePriceResponse.SubOrders["+ i +"].DepreciateInfo.CheapStandAmount"));
			depreciateInfo.setCheapRate(_ctx.longValue("DescribePriceResponse.SubOrders["+ i +"].DepreciateInfo.CheapRate"));
			depreciateInfo.setDifferential(_ctx.longValue("DescribePriceResponse.SubOrders["+ i +"].DepreciateInfo.Differential"));
			depreciateInfo.setDifferentialName(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].DepreciateInfo.DifferentialName"));
			depreciateInfo.setMonthPrice(_ctx.longValue("DescribePriceResponse.SubOrders["+ i +"].DepreciateInfo.MonthPrice"));
			depreciateInfo.setIsContractActivity(_ctx.booleanValue("DescribePriceResponse.SubOrders["+ i +"].DepreciateInfo.IsContractActivity"));
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

			List<OptionalPromotion> optionalPromotions = new ArrayList<OptionalPromotion>();
			for (int j = 0; j < _ctx.lengthValue("DescribePriceResponse.SubOrders["+ i +"].OptionalPromotions.Length"); j++) {
				OptionalPromotion optionalPromotion = new OptionalPromotion();
				optionalPromotion.setSelected(_ctx.booleanValue("DescribePriceResponse.SubOrders["+ i +"].OptionalPromotions["+ j +"].Selected"));
				optionalPromotion.setCouponNo(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].OptionalPromotions["+ j +"].CouponNo"));
				optionalPromotion.setName(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].OptionalPromotions["+ j +"].Name"));
				optionalPromotion.setDescription(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].OptionalPromotions["+ j +"].Description"));
				optionalPromotion.setShow(_ctx.booleanValue("DescribePriceResponse.SubOrders["+ i +"].OptionalPromotions["+ j +"].Show"));
				optionalPromotion.setActivityExtInfo(_ctx.mapValue("DescribePriceResponse.SubOrders["+ i +"].OptionalPromotions["+ j +"].ActivityExtInfo"));
				optionalPromotion.setOptionCode(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].OptionalPromotions["+ j +"].OptionCode"));
				optionalPromotion.setPromotionName(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].OptionalPromotions["+ j +"].PromotionName"));
				optionalPromotion.setPromotionOptionNo(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].OptionalPromotions["+ j +"].PromotionOptionNo"));
				optionalPromotion.setCanPromFee(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].OptionalPromotions["+ j +"].CanPromFee"));

				optionalPromotions.add(optionalPromotion);
			}
			subOrder.setOptionalPromotions(optionalPromotions);

			List<ModuleInstanceItem> moduleInstance = new ArrayList<ModuleInstanceItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance.Length"); j++) {
				ModuleInstanceItem moduleInstanceItem = new ModuleInstanceItem();
				moduleInstanceItem.setModuleCode(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].ModuleCode"));
				moduleInstanceItem.setModuleId(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].ModuleId"));
				moduleInstanceItem.setStandPrice(_ctx.doubleValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].StandPrice"));
				moduleInstanceItem.setPricingModule(_ctx.booleanValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].PricingModule"));
				moduleInstanceItem.setModuleName(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].ModuleName"));
				moduleInstanceItem.setDiscountFee(_ctx.doubleValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].DiscountFee"));
				moduleInstanceItem.setTotalProductFee(_ctx.doubleValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].TotalProductFee"));
				moduleInstanceItem.setNeedOrderPay(_ctx.booleanValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].NeedOrderPay"));
				moduleInstanceItem.setPayFee(_ctx.doubleValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].PayFee"));
				moduleInstanceItem.setContractActivity(_ctx.booleanValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].ContractActivity"));

				DepreciateInfo1 depreciateInfo1 = new DepreciateInfo1();
				depreciateInfo1.setListPrice(_ctx.doubleValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].DepreciateInfo.ListPrice"));
				depreciateInfo1.setOriginalStandAmount(_ctx.doubleValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].DepreciateInfo.OriginalStandAmount"));
				depreciateInfo1.setCheapStandAmount(_ctx.doubleValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].DepreciateInfo.CheapStandAmount"));
				depreciateInfo1.setCheapRate(_ctx.doubleValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].DepreciateInfo.CheapRate"));
				depreciateInfo1.setDifferential(_ctx.doubleValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].DepreciateInfo.Differential"));
				depreciateInfo1.setDifferentialName(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].DepreciateInfo.DifferentialName"));
				depreciateInfo1.setMonthPrice(_ctx.doubleValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].DepreciateInfo.MonthPrice"));
				depreciateInfo1.setIsContractActivity(_ctx.booleanValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].DepreciateInfo.IsContractActivity"));
				depreciateInfo1.setIsShow(_ctx.booleanValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].DepreciateInfo.IsShow"));
				depreciateInfo1.setStartTime(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].DepreciateInfo.StartTime"));
				moduleInstanceItem.setDepreciateInfo1(depreciateInfo1);

				List<ModuleAttr> moduleAttrs = new ArrayList<ModuleAttr>();
				for (int k = 0; k < _ctx.lengthValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].ModuleAttrs.Length"); k++) {
					ModuleAttr moduleAttr = new ModuleAttr();
					moduleAttr.setType(_ctx.longValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].ModuleAttrs["+ k +"].Type"));
					moduleAttr.setValue(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].ModuleAttrs["+ k +"].Value"));
					moduleAttr.setCode(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].ModuleAttrs["+ k +"].Code"));
					moduleAttr.setName(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].ModuleInstance["+ j +"].ModuleAttrs["+ k +"].Name"));

					moduleAttrs.add(moduleAttr);
				}
				moduleInstanceItem.setModuleAttrs(moduleAttrs);

				moduleInstance.add(moduleInstanceItem);
			}
			subOrder.setModuleInstance(moduleInstance);

			List<PromDetail> promDetailList = new ArrayList<PromDetail>();
			for (int j = 0; j < _ctx.lengthValue("DescribePriceResponse.SubOrders["+ i +"].PromDetailList.Length"); j++) {
				PromDetail promDetail = new PromDetail();
				promDetail.setPromotionName(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].PromDetailList["+ j +"].PromotionName"));
				promDetail.setPromotionId(_ctx.longValue("DescribePriceResponse.SubOrders["+ i +"].PromDetailList["+ j +"].PromotionId"));
				promDetail.setFinalPromFee(_ctx.doubleValue("DescribePriceResponse.SubOrders["+ i +"].PromDetailList["+ j +"].FinalPromFee"));
				promDetail.setOptionCode(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].PromDetailList["+ j +"].OptionCode"));
				promDetail.setPromType(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].PromDetailList["+ j +"].PromType"));
				promDetail.setActivityExtInfo(_ctx.mapValue("DescribePriceResponse.SubOrders["+ i +"].PromDetailList["+ j +"].ActivityExtInfo"));
				promDetail.setDerivedPromType(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].PromDetailList["+ j +"].DerivedPromType"));
				promDetail.setPromotionCode(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].PromDetailList["+ j +"].PromotionCode"));

				promDetailList.add(promDetail);
			}
			subOrder.setPromDetailList(promDetailList);

			subOrders.add(subOrder);
		}
		describePriceResponse.setSubOrders(subOrders);
	 
	 	return describePriceResponse;
	}
}