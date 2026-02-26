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

package com.aliyuncs.qualitycheck.transform.v20190115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.qualitycheck.model.v20190115.ListRulesV4Response;
import com.aliyuncs.qualitycheck.model.v20190115.ListRulesV4Response.DataItem;
import com.aliyuncs.qualitycheck.model.v20190115.ListRulesV4Response.DataItem.BusinessCategoryBasicInfoListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRulesV4ResponseUnmarshaller {

	public static ListRulesV4Response unmarshall(ListRulesV4Response listRulesV4Response, UnmarshallerContext _ctx) {
		
		listRulesV4Response.setRequestId(_ctx.stringValue("ListRulesV4Response.RequestId"));
		listRulesV4Response.setTotalCount(_ctx.integerValue("ListRulesV4Response.TotalCount"));
		listRulesV4Response.setBusinessType(_ctx.integerValue("ListRulesV4Response.BusinessType"));
		listRulesV4Response.setCount(_ctx.integerValue("ListRulesV4Response.Count"));
		listRulesV4Response.setCurrentPage(_ctx.integerValue("ListRulesV4Response.CurrentPage"));
		listRulesV4Response.setPageSize(_ctx.integerValue("ListRulesV4Response.PageSize"));
		listRulesV4Response.setPageNumber(_ctx.integerValue("ListRulesV4Response.PageNumber"));
		listRulesV4Response.setSuccess(_ctx.booleanValue("ListRulesV4Response.Success"));
		listRulesV4Response.setCode(_ctx.stringValue("ListRulesV4Response.Code"));
		listRulesV4Response.setMessage(_ctx.stringValue("ListRulesV4Response.Message"));
		listRulesV4Response.setHttpStatusCode(_ctx.integerValue("ListRulesV4Response.HttpStatusCode"));

		List<String> messages = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListRulesV4Response.Messages.Length"); i++) {
			messages.add(_ctx.stringValue("ListRulesV4Response.Messages["+ i +"]"));
		}
		listRulesV4Response.setMessages(messages);

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListRulesV4Response.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setRid(_ctx.longValue("ListRulesV4Response.Data["+ i +"].Rid"));
			dataItem.setName(_ctx.stringValue("ListRulesV4Response.Data["+ i +"].Name"));
			dataItem.setType(_ctx.integerValue("ListRulesV4Response.Data["+ i +"].Type"));
			dataItem.setStatus(_ctx.integerValue("ListRulesV4Response.Data["+ i +"].Status"));
			dataItem.setCheckNumber(_ctx.longValue("ListRulesV4Response.Data["+ i +"].CheckNumber"));
			dataItem.setHitNumber(_ctx.longValue("ListRulesV4Response.Data["+ i +"].HitNumber"));
			dataItem.setHitRate(_ctx.floatValue("ListRulesV4Response.Data["+ i +"].HitRate"));
			dataItem.setReviewAccuracyRate(_ctx.floatValue("ListRulesV4Response.Data["+ i +"].ReviewAccuracyRate"));
			dataItem.setReviewRate(_ctx.floatValue("ListRulesV4Response.Data["+ i +"].ReviewRate"));
			dataItem.setPreReviewNumber(_ctx.longValue("ListRulesV4Response.Data["+ i +"].PreReviewNumber"));
			dataItem.setReviewNumber(_ctx.longValue("ListRulesV4Response.Data["+ i +"].ReviewNumber"));
			dataItem.setUnReviewNumber(_ctx.longValue("ListRulesV4Response.Data["+ i +"].UnReviewNumber"));
			dataItem.setProblemNumber(_ctx.longValue("ListRulesV4Response.Data["+ i +"].ProblemNumber"));
			dataItem.setStartTime(_ctx.stringValue("ListRulesV4Response.Data["+ i +"].StartTime"));
			dataItem.setEndTime(_ctx.stringValue("ListRulesV4Response.Data["+ i +"].EndTime"));
			dataItem.setCreateTime(_ctx.stringValue("ListRulesV4Response.Data["+ i +"].CreateTime"));
			dataItem.setCreateEmpid(_ctx.stringValue("ListRulesV4Response.Data["+ i +"].CreateEmpid"));
			dataItem.setCreateEmpName(_ctx.stringValue("ListRulesV4Response.Data["+ i +"].CreateEmpName"));
			dataItem.setLastUpdateEmpid(_ctx.stringValue("ListRulesV4Response.Data["+ i +"].LastUpdateEmpid"));
			dataItem.setLastUpdateEmpName(_ctx.stringValue("ListRulesV4Response.Data["+ i +"].LastUpdateEmpName"));
			dataItem.setLastUpdateTime(_ctx.stringValue("ListRulesV4Response.Data["+ i +"].LastUpdateTime"));
			dataItem.setIsDelete(_ctx.integerValue("ListRulesV4Response.Data["+ i +"].IsDelete"));
			dataItem.setTypeName(_ctx.stringValue("ListRulesV4Response.Data["+ i +"].TypeName"));
			dataItem.setJobName(_ctx.stringValue("ListRulesV4Response.Data["+ i +"].JobName"));
			dataItem.setComments(_ctx.stringValue("ListRulesV4Response.Data["+ i +"].Comments"));
			dataItem.setRealViolationNumber(_ctx.integerValue("ListRulesV4Response.Data["+ i +"].RealViolationNumber"));
			dataItem.setHitRealViolationRate(_ctx.floatValue("ListRulesV4Response.Data["+ i +"].HitRealViolationRate"));
			dataItem.setReviewStatusName(_ctx.stringValue("ListRulesV4Response.Data["+ i +"].ReviewStatusName"));
			dataItem.setDeny(_ctx.integerValue("ListRulesV4Response.Data["+ i +"].Deny"));
			dataItem.setScoreSubId(_ctx.longValue("ListRulesV4Response.Data["+ i +"].ScoreSubId"));
			dataItem.setAutoReview(_ctx.integerValue("ListRulesV4Response.Data["+ i +"].AutoReview"));
			dataItem.setRuleScoreType(_ctx.integerValue("ListRulesV4Response.Data["+ i +"].RuleScoreType"));
			dataItem.setUserGroup(_ctx.stringValue("ListRulesV4Response.Data["+ i +"].UserGroup"));
			dataItem.setOperationMode(_ctx.integerValue("ListRulesV4Response.Data["+ i +"].OperationMode"));
			dataItem.setIsSelect(_ctx.booleanValue("ListRulesV4Response.Data["+ i +"].IsSelect"));
			dataItem.setRuleType(_ctx.integerValue("ListRulesV4Response.Data["+ i +"].RuleType"));
			dataItem.setEffective(_ctx.integerValue("ListRulesV4Response.Data["+ i +"].Effective"));
			dataItem.setFullCycle(_ctx.integerValue("ListRulesV4Response.Data["+ i +"].FullCycle"));
			dataItem.setEffectiveStartTime(_ctx.stringValue("ListRulesV4Response.Data["+ i +"].EffectiveStartTime"));
			dataItem.setEffectiveEndTime(_ctx.stringValue("ListRulesV4Response.Data["+ i +"].EffectiveEndTime"));
			dataItem.setQualityCheckType(_ctx.integerValue("ListRulesV4Response.Data["+ i +"].QualityCheckType"));
			dataItem.setRuleScoreSingleType(_ctx.integerValue("ListRulesV4Response.Data["+ i +"].RuleScoreSingleType"));
			dataItem.setTargetType(_ctx.integerValue("ListRulesV4Response.Data["+ i +"].TargetType"));

			List<Integer> businessRange = new ArrayList<Integer>();
			for (int j = 0; j < _ctx.lengthValue("ListRulesV4Response.Data["+ i +"].BusinessRange.Length"); j++) {
				businessRange.add(_ctx.integerValue("ListRulesV4Response.Data["+ i +"].BusinessRange["+ j +"]"));
			}
			dataItem.setBusinessRange(businessRange);

			List<String> businessCategoryNameList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListRulesV4Response.Data["+ i +"].BusinessCategoryNameList.Length"); j++) {
				businessCategoryNameList.add(_ctx.stringValue("ListRulesV4Response.Data["+ i +"].BusinessCategoryNameList["+ j +"]"));
			}
			dataItem.setBusinessCategoryNameList(businessCategoryNameList);

			List<BusinessCategoryBasicInfoListItem> businessCategoryBasicInfoList = new ArrayList<BusinessCategoryBasicInfoListItem>();
			for (int j = 0; j < _ctx.lengthValue("ListRulesV4Response.Data["+ i +"].BusinessCategoryBasicInfoList.Length"); j++) {
				BusinessCategoryBasicInfoListItem businessCategoryBasicInfoListItem = new BusinessCategoryBasicInfoListItem();
				businessCategoryBasicInfoListItem.setBid(_ctx.integerValue("ListRulesV4Response.Data["+ i +"].BusinessCategoryBasicInfoList["+ j +"].Bid"));
				businessCategoryBasicInfoListItem.setServiceType(_ctx.integerValue("ListRulesV4Response.Data["+ i +"].BusinessCategoryBasicInfoList["+ j +"].ServiceType"));
				businessCategoryBasicInfoListItem.setName(_ctx.stringValue("ListRulesV4Response.Data["+ i +"].BusinessCategoryBasicInfoList["+ j +"].Name"));
				businessCategoryBasicInfoListItem.setOriginalId(_ctx.longValue("ListRulesV4Response.Data["+ i +"].BusinessCategoryBasicInfoList["+ j +"].OriginalId"));

				businessCategoryBasicInfoList.add(businessCategoryBasicInfoListItem);
			}
			dataItem.setBusinessCategoryBasicInfoList(businessCategoryBasicInfoList);

			data.add(dataItem);
		}
		listRulesV4Response.setData(data);
	 
	 	return listRulesV4Response;
	}
}