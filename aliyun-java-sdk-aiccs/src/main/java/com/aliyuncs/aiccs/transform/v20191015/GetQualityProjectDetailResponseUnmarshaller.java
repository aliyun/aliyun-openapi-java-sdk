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

import com.aliyuncs.aiccs.model.v20191015.GetQualityProjectDetailResponse;
import com.aliyuncs.aiccs.model.v20191015.GetQualityProjectDetailResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetQualityProjectDetailResponseUnmarshaller {

	public static GetQualityProjectDetailResponse unmarshall(GetQualityProjectDetailResponse getQualityProjectDetailResponse, UnmarshallerContext _ctx) {
		
		getQualityProjectDetailResponse.setRequestId(_ctx.stringValue("GetQualityProjectDetailResponse.RequestId"));
		getQualityProjectDetailResponse.setMessage(_ctx.stringValue("GetQualityProjectDetailResponse.Message"));
		getQualityProjectDetailResponse.setCode(_ctx.stringValue("GetQualityProjectDetailResponse.Code"));
		getQualityProjectDetailResponse.setSuccess(_ctx.stringValue("GetQualityProjectDetailResponse.Success"));

		Data data = new Data();
		data.setStatus(_ctx.integerValue("GetQualityProjectDetailResponse.Data.Status"));
		data.setQualityType(_ctx.integerValue("GetQualityProjectDetailResponse.Data.QualityType"));
		data.setCreateTime(_ctx.stringValue("GetQualityProjectDetailResponse.Data.CreateTime"));
		data.setProjectName(_ctx.stringValue("GetQualityProjectDetailResponse.Data.ProjectName"));
		data.setCheckFreqType(_ctx.integerValue("GetQualityProjectDetailResponse.Data.CheckFreqType"));
		data.setVersion(_ctx.integerValue("GetQualityProjectDetailResponse.Data.Version"));
		data.setId(_ctx.longValue("GetQualityProjectDetailResponse.Data.Id"));
		data.setModifyTime(_ctx.stringValue("GetQualityProjectDetailResponse.Data.ModifyTime"));

		List<Long> qualityRuleIds = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("GetQualityProjectDetailResponse.Data.QualityRuleIds.Length"); i++) {
			qualityRuleIds.add(_ctx.longValue("GetQualityProjectDetailResponse.Data.QualityRuleIds["+ i +"]"));
		}
		data.setQualityRuleIds(qualityRuleIds);

		List<Long> depList = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("GetQualityProjectDetailResponse.Data.DepList.Length"); i++) {
			depList.add(_ctx.longValue("GetQualityProjectDetailResponse.Data.DepList["+ i +"]"));
		}
		data.setDepList(depList);

		List<Long> servicerList = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("GetQualityProjectDetailResponse.Data.ServicerList.Length"); i++) {
			servicerList.add(_ctx.longValue("GetQualityProjectDetailResponse.Data.ServicerList["+ i +"]"));
		}
		data.setServicerList(servicerList);

		List<Long> groupList = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("GetQualityProjectDetailResponse.Data.GroupList.Length"); i++) {
			groupList.add(_ctx.longValue("GetQualityProjectDetailResponse.Data.GroupList["+ i +"]"));
		}
		data.setGroupList(groupList);
		getQualityProjectDetailResponse.setData(data);
	 
	 	return getQualityProjectDetailResponse;
	}
}