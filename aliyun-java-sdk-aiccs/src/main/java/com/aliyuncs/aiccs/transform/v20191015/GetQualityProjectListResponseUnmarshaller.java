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

import com.aliyuncs.aiccs.model.v20191015.GetQualityProjectListResponse;
import com.aliyuncs.aiccs.model.v20191015.GetQualityProjectListResponse.Data;
import com.aliyuncs.aiccs.model.v20191015.GetQualityProjectListResponse.Data.QualityProjectListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetQualityProjectListResponseUnmarshaller {

	public static GetQualityProjectListResponse unmarshall(GetQualityProjectListResponse getQualityProjectListResponse, UnmarshallerContext _ctx) {
		
		getQualityProjectListResponse.setRequestId(_ctx.stringValue("GetQualityProjectListResponse.RequestId"));
		getQualityProjectListResponse.setMessage(_ctx.stringValue("GetQualityProjectListResponse.Message"));
		getQualityProjectListResponse.setCode(_ctx.stringValue("GetQualityProjectListResponse.Code"));
		getQualityProjectListResponse.setSuccess(_ctx.booleanValue("GetQualityProjectListResponse.Success"));

		Data data = new Data();
		data.setPageNo(_ctx.integerValue("GetQualityProjectListResponse.Data.PageNo"));
		data.setPageSize(_ctx.integerValue("GetQualityProjectListResponse.Data.PageSize"));
		data.setTotal(_ctx.longValue("GetQualityProjectListResponse.Data.Total"));

		List<QualityProjectListItem> qualityProjectList = new ArrayList<QualityProjectListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetQualityProjectListResponse.Data.QualityProjectList.Length"); i++) {
			QualityProjectListItem qualityProjectListItem = new QualityProjectListItem();
			qualityProjectListItem.setStatus(_ctx.integerValue("GetQualityProjectListResponse.Data.QualityProjectList["+ i +"].Status"));
			qualityProjectListItem.setQualityType(_ctx.integerValue("GetQualityProjectListResponse.Data.QualityProjectList["+ i +"].QualityType"));
			qualityProjectListItem.setCreateTime(_ctx.stringValue("GetQualityProjectListResponse.Data.QualityProjectList["+ i +"].CreateTime"));
			qualityProjectListItem.setProjectName(_ctx.stringValue("GetQualityProjectListResponse.Data.QualityProjectList["+ i +"].ProjectName"));
			qualityProjectListItem.setCheckFreqType(_ctx.integerValue("GetQualityProjectListResponse.Data.QualityProjectList["+ i +"].CheckFreqType"));
			qualityProjectListItem.setVersion(_ctx.integerValue("GetQualityProjectListResponse.Data.QualityProjectList["+ i +"].Version"));
			qualityProjectListItem.setId(_ctx.longValue("GetQualityProjectListResponse.Data.QualityProjectList["+ i +"].Id"));
			qualityProjectListItem.setModifyTime(_ctx.stringValue("GetQualityProjectListResponse.Data.QualityProjectList["+ i +"].ModifyTime"));

			List<Long> qualityRuleIds = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("GetQualityProjectListResponse.Data.QualityProjectList["+ i +"].QualityRuleIds.Length"); j++) {
				qualityRuleIds.add(_ctx.longValue("GetQualityProjectListResponse.Data.QualityProjectList["+ i +"].QualityRuleIds["+ j +"]"));
			}
			qualityProjectListItem.setQualityRuleIds(qualityRuleIds);

			List<Long> depList = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("GetQualityProjectListResponse.Data.QualityProjectList["+ i +"].DepList.Length"); j++) {
				depList.add(_ctx.longValue("GetQualityProjectListResponse.Data.QualityProjectList["+ i +"].DepList["+ j +"]"));
			}
			qualityProjectListItem.setDepList(depList);

			List<Long> servicerList = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("GetQualityProjectListResponse.Data.QualityProjectList["+ i +"].ServicerList.Length"); j++) {
				servicerList.add(_ctx.longValue("GetQualityProjectListResponse.Data.QualityProjectList["+ i +"].ServicerList["+ j +"]"));
			}
			qualityProjectListItem.setServicerList(servicerList);

			List<Long> groupList = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("GetQualityProjectListResponse.Data.QualityProjectList["+ i +"].GroupList.Length"); j++) {
				groupList.add(_ctx.longValue("GetQualityProjectListResponse.Data.QualityProjectList["+ i +"].GroupList["+ j +"]"));
			}
			qualityProjectListItem.setGroupList(groupList);

			qualityProjectList.add(qualityProjectListItem);
		}
		data.setQualityProjectList(qualityProjectList);
		getQualityProjectListResponse.setData(data);
	 
	 	return getQualityProjectListResponse;
	}
}