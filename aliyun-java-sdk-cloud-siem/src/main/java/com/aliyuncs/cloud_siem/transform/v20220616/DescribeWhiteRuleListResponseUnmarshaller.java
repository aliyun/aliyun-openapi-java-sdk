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

package com.aliyuncs.cloud_siem.transform.v20220616;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloud_siem.model.v20220616.DescribeWhiteRuleListResponse;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeWhiteRuleListResponse.Data;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeWhiteRuleListResponse.Data.PageInfo;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeWhiteRuleListResponse.Data.ResponseDataItem;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeWhiteRuleListResponse.Data.ResponseDataItem.Expression;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeWhiteRuleListResponse.Data.ResponseDataItem.Expression.Condition;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeWhiteRuleListResponse.Data.ResponseDataItem.Expression.Condition.Left;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeWhiteRuleListResponse.Data.ResponseDataItem.Expression.Condition.Right;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWhiteRuleListResponseUnmarshaller {

	public static DescribeWhiteRuleListResponse unmarshall(DescribeWhiteRuleListResponse describeWhiteRuleListResponse, UnmarshallerContext _ctx) {
		
		describeWhiteRuleListResponse.setRequestId(_ctx.stringValue("DescribeWhiteRuleListResponse.RequestId"));
		describeWhiteRuleListResponse.setSuccess(_ctx.booleanValue("DescribeWhiteRuleListResponse.Success"));
		describeWhiteRuleListResponse.setCode(_ctx.integerValue("DescribeWhiteRuleListResponse.Code"));
		describeWhiteRuleListResponse.setMessage(_ctx.stringValue("DescribeWhiteRuleListResponse.Message"));

		Data data = new Data();

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("DescribeWhiteRuleListResponse.Data.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("DescribeWhiteRuleListResponse.Data.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.longValue("DescribeWhiteRuleListResponse.Data.PageInfo.TotalCount"));
		data.setPageInfo(pageInfo);

		List<ResponseDataItem> responseData = new ArrayList<ResponseDataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeWhiteRuleListResponse.Data.ResponseData.Length"); i++) {
			ResponseDataItem responseDataItem = new ResponseDataItem();
			responseDataItem.setId(_ctx.longValue("DescribeWhiteRuleListResponse.Data.ResponseData["+ i +"].Id"));
			responseDataItem.setGmtCreate(_ctx.stringValue("DescribeWhiteRuleListResponse.Data.ResponseData["+ i +"].GmtCreate"));
			responseDataItem.setGmtModified(_ctx.stringValue("DescribeWhiteRuleListResponse.Data.ResponseData["+ i +"].GmtModified"));
			responseDataItem.setAliuid(_ctx.longValue("DescribeWhiteRuleListResponse.Data.ResponseData["+ i +"].Aliuid"));
			responseDataItem.setSubAliuid(_ctx.longValue("DescribeWhiteRuleListResponse.Data.ResponseData["+ i +"].SubAliuid"));
			responseDataItem.setAlertType(_ctx.stringValue("DescribeWhiteRuleListResponse.Data.ResponseData["+ i +"].AlertType"));
			responseDataItem.setAlertTypeId(_ctx.stringValue("DescribeWhiteRuleListResponse.Data.ResponseData["+ i +"].AlertTypeId"));
			responseDataItem.setAlertName(_ctx.stringValue("DescribeWhiteRuleListResponse.Data.ResponseData["+ i +"].AlertName"));
			responseDataItem.setAlertNameId(_ctx.stringValue("DescribeWhiteRuleListResponse.Data.ResponseData["+ i +"].AlertNameId"));
			responseDataItem.setStatus(_ctx.integerValue("DescribeWhiteRuleListResponse.Data.ResponseData["+ i +"].Status"));
			responseDataItem.setIncidentUuid(_ctx.stringValue("DescribeWhiteRuleListResponse.Data.ResponseData["+ i +"].IncidentUuid"));
			responseDataItem.setAlertUuid(_ctx.stringValue("DescribeWhiteRuleListResponse.Data.ResponseData["+ i +"].AlertUuid"));

			Expression expression = new Expression();
			expression.setLogic(_ctx.stringValue("DescribeWhiteRuleListResponse.Data.ResponseData["+ i +"].Expression.Logic"));

			List<Condition> conditions = new ArrayList<Condition>();
			for (int j = 0; j < _ctx.lengthValue("DescribeWhiteRuleListResponse.Data.ResponseData["+ i +"].Expression.Conditions.Length"); j++) {
				Condition condition = new Condition();
				condition.setItemId(_ctx.integerValue("DescribeWhiteRuleListResponse.Data.ResponseData["+ i +"].Expression.Conditions["+ j +"].ItemId"));
				condition.setOperator(_ctx.stringValue("DescribeWhiteRuleListResponse.Data.ResponseData["+ i +"].Expression.Conditions["+ j +"].Operator"));
				condition.setIsNot(_ctx.booleanValue("DescribeWhiteRuleListResponse.Data.ResponseData["+ i +"].Expression.Conditions["+ j +"].IsNot"));

				Left left = new Left();
				left.setValue(_ctx.stringValue("DescribeWhiteRuleListResponse.Data.ResponseData["+ i +"].Expression.Conditions["+ j +"].Left.Value"));
				left.setIsVar(_ctx.booleanValue("DescribeWhiteRuleListResponse.Data.ResponseData["+ i +"].Expression.Conditions["+ j +"].Left.IsVar"));
				left.setType(_ctx.stringValue("DescribeWhiteRuleListResponse.Data.ResponseData["+ i +"].Expression.Conditions["+ j +"].Left.Type"));
				left.setModifier(_ctx.stringValue("DescribeWhiteRuleListResponse.Data.ResponseData["+ i +"].Expression.Conditions["+ j +"].Left.Modifier"));
				left.setModifierParam(_ctx.mapValue("DescribeWhiteRuleListResponse.Data.ResponseData["+ i +"].Expression.Conditions["+ j +"].Left.ModifierParam"));
				condition.setLeft(left);

				Right right = new Right();
				right.setValue(_ctx.stringValue("DescribeWhiteRuleListResponse.Data.ResponseData["+ i +"].Expression.Conditions["+ j +"].Right.Value"));
				right.setIsVar(_ctx.booleanValue("DescribeWhiteRuleListResponse.Data.ResponseData["+ i +"].Expression.Conditions["+ j +"].Right.IsVar"));
				right.setType(_ctx.stringValue("DescribeWhiteRuleListResponse.Data.ResponseData["+ i +"].Expression.Conditions["+ j +"].Right.Type"));
				right.setModifier(_ctx.stringValue("DescribeWhiteRuleListResponse.Data.ResponseData["+ i +"].Expression.Conditions["+ j +"].Right.Modifier"));
				right.setModifierParam(_ctx.mapValue("DescribeWhiteRuleListResponse.Data.ResponseData["+ i +"].Expression.Conditions["+ j +"].Right.ModifierParam"));
				condition.setRight(right);

				conditions.add(condition);
			}
			expression.setConditions(conditions);
			responseDataItem.setExpression(expression);

			responseData.add(responseDataItem);
		}
		data.setResponseData(responseData);
		describeWhiteRuleListResponse.setData(data);
	 
	 	return describeWhiteRuleListResponse;
	}
}