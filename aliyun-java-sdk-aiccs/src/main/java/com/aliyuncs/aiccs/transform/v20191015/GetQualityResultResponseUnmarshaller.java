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

package com.aliyuncs.aiccs.transform.v20191015;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aiccs.model.v20191015.GetQualityResultResponse;
import com.aliyuncs.aiccs.model.v20191015.GetQualityResultResponse.Data;
import com.aliyuncs.aiccs.model.v20191015.GetQualityResultResponse.Data.QualityResultResponseListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetQualityResultResponseUnmarshaller {

	public static GetQualityResultResponse unmarshall(GetQualityResultResponse getQualityResultResponse, UnmarshallerContext _ctx) {
		
		getQualityResultResponse.setRequestId(_ctx.stringValue("GetQualityResultResponse.RequestId"));
		getQualityResultResponse.setMessage(_ctx.stringValue("GetQualityResultResponse.Message"));
		getQualityResultResponse.setCode(_ctx.stringValue("GetQualityResultResponse.Code"));
		getQualityResultResponse.setChannelTypeName(_ctx.stringValue("GetQualityResultResponse.ChannelTypeName"));
		getQualityResultResponse.setSuccess(_ctx.booleanValue("GetQualityResultResponse.Success"));

		Data data = new Data();
		data.setPageNo(_ctx.integerValue("GetQualityResultResponse.Data.PageNo"));
		data.setPageSize(_ctx.integerValue("GetQualityResultResponse.Data.PageSize"));
		data.setTotalNum(_ctx.integerValue("GetQualityResultResponse.Data.TotalNum"));

		List<QualityResultResponseListItem> qualityResultResponseList = new ArrayList<QualityResultResponseListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetQualityResultResponse.Data.QualityResultResponseList.Length"); i++) {
			QualityResultResponseListItem qualityResultResponseListItem = new QualityResultResponseListItem();
			qualityResultResponseListItem.setTouchId(_ctx.stringValue("GetQualityResultResponse.Data.QualityResultResponseList["+ i +"].TouchId"));
			qualityResultResponseListItem.setServicerName(_ctx.stringValue("GetQualityResultResponse.Data.QualityResultResponseList["+ i +"].ServicerName"));
			qualityResultResponseListItem.setMemberName(_ctx.stringValue("GetQualityResultResponse.Data.QualityResultResponseList["+ i +"].MemberName"));
			qualityResultResponseListItem.setProjectName(_ctx.stringValue("GetQualityResultResponse.Data.QualityResultResponseList["+ i +"].ProjectName"));
			qualityResultResponseListItem.setProjectId(_ctx.stringValue("GetQualityResultResponse.Data.QualityResultResponseList["+ i +"].ProjectId"));
			qualityResultResponseListItem.setChannelType(_ctx.stringValue("GetQualityResultResponse.Data.QualityResultResponseList["+ i +"].ChannelType"));
			qualityResultResponseListItem.setChannelTypeName(_ctx.stringValue("GetQualityResultResponse.Data.QualityResultResponseList["+ i +"].ChannelTypeName"));
			qualityResultResponseListItem.setTouchStartTime(_ctx.stringValue("GetQualityResultResponse.Data.QualityResultResponseList["+ i +"].TouchStartTime"));
			qualityResultResponseListItem.setServicerId(_ctx.stringValue("GetQualityResultResponse.Data.QualityResultResponseList["+ i +"].ServicerId"));
			qualityResultResponseListItem.setRuleName(_ctx.stringValue("GetQualityResultResponse.Data.QualityResultResponseList["+ i +"].RuleName"));
			qualityResultResponseListItem.setRuleId(_ctx.stringValue("GetQualityResultResponse.Data.QualityResultResponseList["+ i +"].RuleId"));
			qualityResultResponseListItem.setGroupName(_ctx.stringValue("GetQualityResultResponse.Data.QualityResultResponseList["+ i +"].GroupName"));
			qualityResultResponseListItem.setGroupId(_ctx.stringValue("GetQualityResultResponse.Data.QualityResultResponseList["+ i +"].GroupId"));
			qualityResultResponseListItem.setInstanceName(_ctx.stringValue("GetQualityResultResponse.Data.QualityResultResponseList["+ i +"].InstanceName"));
			qualityResultResponseListItem.setHitStatus(_ctx.booleanValue("GetQualityResultResponse.Data.QualityResultResponseList["+ i +"].HitStatus"));
			qualityResultResponseListItem.setHitDetail(_ctx.stringValue("GetQualityResultResponse.Data.QualityResultResponseList["+ i +"].HitDetail"));

			qualityResultResponseList.add(qualityResultResponseListItem);
		}
		data.setQualityResultResponseList(qualityResultResponseList);
		getQualityResultResponse.setData(data);
	 
	 	return getQualityResultResponse;
	}
}