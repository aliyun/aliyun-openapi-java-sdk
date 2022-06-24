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

package com.aliyuncs.unimkt.transform.v20181212;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.unimkt.model.v20181212.ListTasksResponse;
import com.aliyuncs.unimkt.model.v20181212.ListTasksResponse.Data;
import com.aliyuncs.unimkt.model.v20181212.ListTasksResponse.Data.EffectMarketingTask;
import com.aliyuncs.unimkt.model.v20181212.ListTasksResponse.Data.EffectMarketingTask.ActualBankRegisterVO;
import com.aliyuncs.unimkt.model.v20181212.ListTasksResponse.Data.EffectMarketingTask.PredictBankRegisterVO;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTasksResponseUnmarshaller {

	public static ListTasksResponse unmarshall(ListTasksResponse listTasksResponse, UnmarshallerContext _ctx) {
		
		listTasksResponse.setRequestId(_ctx.stringValue("ListTasksResponse.RequestId"));
		listTasksResponse.setErrorMsg(_ctx.stringValue("ListTasksResponse.ErrorMsg"));
		listTasksResponse.setCode(_ctx.longValue("ListTasksResponse.Code"));
		listTasksResponse.setSuccess(_ctx.booleanValue("ListTasksResponse.Success"));

		Data data = new Data();
		data.setBizTypes(_ctx.stringValue("ListTasksResponse.Data.BizTypes"));
		data.setCount(_ctx.longValue("ListTasksResponse.Data.Count"));
		data.setTaskRules(_ctx.stringValue("ListTasksResponse.Data.TaskRules"));
		data.setType(_ctx.integerValue("ListTasksResponse.Data.Type"));

		List<EffectMarketingTask> list = new ArrayList<EffectMarketingTask>();
		for (int i = 0; i < _ctx.lengthValue("ListTasksResponse.Data.List.Length"); i++) {
			EffectMarketingTask effectMarketingTask = new EffectMarketingTask();
			effectMarketingTask.setAccountNo(_ctx.stringValue("ListTasksResponse.Data.List["+ i +"].AccountNo"));
			effectMarketingTask.setAccountStatus(_ctx.longValue("ListTasksResponse.Data.List["+ i +"].AccountStatus"));
			effectMarketingTask.setActualConsumeAmount(_ctx.longValue("ListTasksResponse.Data.List["+ i +"].ActualConsumeAmount"));
			effectMarketingTask.setBrandActualResultNumber(_ctx.longValue("ListTasksResponse.Data.List["+ i +"].BrandActualResultNumber"));
			effectMarketingTask.setBrandPredictResultNumber(_ctx.longValue("ListTasksResponse.Data.List["+ i +"].BrandPredictResultNumber"));
			effectMarketingTask.setBrandUserId(_ctx.longValue("ListTasksResponse.Data.List["+ i +"].BrandUserId"));
			effectMarketingTask.setBrandUserNick(_ctx.stringValue("ListTasksResponse.Data.List["+ i +"].BrandUserNick"));
			effectMarketingTask.setCouponNewActualResultNumber(_ctx.longValue("ListTasksResponse.Data.List["+ i +"].CouponNewActualResultNumber"));
			effectMarketingTask.setCouponNewPredictResultNumber(_ctx.longValue("ListTasksResponse.Data.List["+ i +"].CouponNewPredictResultNumber"));
			effectMarketingTask.setCouponNewPriceStep(_ctx.longValue("ListTasksResponse.Data.List["+ i +"].CouponNewPriceStep"));
			effectMarketingTask.setCouponOldActualResultNumber(_ctx.longValue("ListTasksResponse.Data.List["+ i +"].CouponOldActualResultNumber"));
			effectMarketingTask.setCouponOldPredictResultNumber(_ctx.longValue("ListTasksResponse.Data.List["+ i +"].CouponOldPredictResultNumber"));
			effectMarketingTask.setCouponOldPriceStep(_ctx.longValue("ListTasksResponse.Data.List["+ i +"].CouponOldPriceStep"));
			effectMarketingTask.setEndTime(_ctx.longValue("ListTasksResponse.Data.List["+ i +"].EndTime"));
			effectMarketingTask.setGmtCreate(_ctx.longValue("ListTasksResponse.Data.List["+ i +"].GmtCreate"));
			effectMarketingTask.setGmtModified(_ctx.longValue("ListTasksResponse.Data.List["+ i +"].GmtModified"));
			effectMarketingTask.setId(_ctx.longValue("ListTasksResponse.Data.List["+ i +"].Id"));
			effectMarketingTask.setLoginActualResultNumber(_ctx.longValue("ListTasksResponse.Data.List["+ i +"].LoginActualResultNumber"));
			effectMarketingTask.setLoginPredictResultNumber(_ctx.longValue("ListTasksResponse.Data.List["+ i +"].LoginPredictResultNumber"));
			effectMarketingTask.setMainId(_ctx.longValue("ListTasksResponse.Data.List["+ i +"].MainId"));
			effectMarketingTask.setMainType(_ctx.longValue("ListTasksResponse.Data.List["+ i +"].MainType"));
			effectMarketingTask.setOpNick(_ctx.stringValue("ListTasksResponse.Data.List["+ i +"].OpNick"));
			effectMarketingTask.setOrderActualResultNumber(_ctx.longValue("ListTasksResponse.Data.List["+ i +"].OrderActualResultNumber"));
			effectMarketingTask.setOrderPredictResultNumber(_ctx.longValue("ListTasksResponse.Data.List["+ i +"].OrderPredictResultNumber"));
			effectMarketingTask.setPredictConsumeAmount(_ctx.longValue("ListTasksResponse.Data.List["+ i +"].PredictConsumeAmount"));
			effectMarketingTask.setPriceType(_ctx.longValue("ListTasksResponse.Data.List["+ i +"].PriceType"));
			effectMarketingTask.setProxyUserId(_ctx.longValue("ListTasksResponse.Data.List["+ i +"].ProxyUserId"));
			effectMarketingTask.setProxyUserNick(_ctx.stringValue("ListTasksResponse.Data.List["+ i +"].ProxyUserNick"));
			effectMarketingTask.setScheduleTime(_ctx.stringValue("ListTasksResponse.Data.List["+ i +"].ScheduleTime"));
			effectMarketingTask.setScheduleType(_ctx.longValue("ListTasksResponse.Data.List["+ i +"].ScheduleType"));
			effectMarketingTask.setStartTime(_ctx.longValue("ListTasksResponse.Data.List["+ i +"].StartTime"));
			effectMarketingTask.setStatus(_ctx.longValue("ListTasksResponse.Data.List["+ i +"].Status"));
			effectMarketingTask.setSystemActualConsumeAmount(_ctx.longValue("ListTasksResponse.Data.List["+ i +"].SystemActualConsumeAmount"));
			effectMarketingTask.setTargetUrl(_ctx.stringValue("ListTasksResponse.Data.List["+ i +"].TargetUrl"));
			effectMarketingTask.setTaskGroupId(_ctx.longValue("ListTasksResponse.Data.List["+ i +"].TaskGroupId"));
			effectMarketingTask.setTaskId(_ctx.longValue("ListTasksResponse.Data.List["+ i +"].TaskId"));
			effectMarketingTask.setTaskMarketingType(_ctx.longValue("ListTasksResponse.Data.List["+ i +"].TaskMarketingType"));
			effectMarketingTask.setTaskName(_ctx.stringValue("ListTasksResponse.Data.List["+ i +"].TaskName"));
			effectMarketingTask.setTaskType(_ctx.stringValue("ListTasksResponse.Data.List["+ i +"].TaskType"));
			effectMarketingTask.setPredictInfo(_ctx.stringValue("ListTasksResponse.Data.List["+ i +"].PredictInfo"));
			effectMarketingTask.setActualInfo(_ctx.stringValue("ListTasksResponse.Data.List["+ i +"].ActualInfo"));
			effectMarketingTask.setCurrencyType(_ctx.longValue("ListTasksResponse.Data.List["+ i +"].CurrencyType"));

			PredictBankRegisterVO predictBankRegisterVO = new PredictBankRegisterVO();
			predictBankRegisterVO.setInComingPartsNumber(_ctx.longValue("ListTasksResponse.Data.List["+ i +"].PredictBankRegisterVO.InComingPartsNumber"));
			predictBankRegisterVO.setVerificationCardNumber(_ctx.longValue("ListTasksResponse.Data.List["+ i +"].PredictBankRegisterVO.VerificationCardNumber"));
			predictBankRegisterVO.setVisaInterviewNumber(_ctx.longValue("ListTasksResponse.Data.List["+ i +"].PredictBankRegisterVO.VisaInterviewNumber"));
			predictBankRegisterVO.setSwipingCardNumber(_ctx.longValue("ListTasksResponse.Data.List["+ i +"].PredictBankRegisterVO.SwipingCardNumber"));
			predictBankRegisterVO.setPlaceOrderNumber(_ctx.longValue("ListTasksResponse.Data.List["+ i +"].PredictBankRegisterVO.PlaceOrderNumber"));
			effectMarketingTask.setPredictBankRegisterVO(predictBankRegisterVO);

			ActualBankRegisterVO actualBankRegisterVO = new ActualBankRegisterVO();
			actualBankRegisterVO.setInComingPartsNumber(_ctx.longValue("ListTasksResponse.Data.List["+ i +"].ActualBankRegisterVO.InComingPartsNumber"));
			actualBankRegisterVO.setVerificationCardNumber(_ctx.longValue("ListTasksResponse.Data.List["+ i +"].ActualBankRegisterVO.VerificationCardNumber"));
			actualBankRegisterVO.setVisaInterviewNumber(_ctx.longValue("ListTasksResponse.Data.List["+ i +"].ActualBankRegisterVO.VisaInterviewNumber"));
			actualBankRegisterVO.setSwipingCardNumber(_ctx.longValue("ListTasksResponse.Data.List["+ i +"].ActualBankRegisterVO.SwipingCardNumber"));
			actualBankRegisterVO.setPlaceOrderNumber(_ctx.longValue("ListTasksResponse.Data.List["+ i +"].ActualBankRegisterVO.PlaceOrderNumber"));
			effectMarketingTask.setActualBankRegisterVO(actualBankRegisterVO);

			list.add(effectMarketingTask);
		}
		data.setList(list);
		listTasksResponse.setData(data);
	 
	 	return listTasksResponse;
	}
}