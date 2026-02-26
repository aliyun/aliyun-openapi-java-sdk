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

package com.aliyuncs.dt_oc_info.transform.v20220829;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dt_oc_info.model.v20220829.GetOcOperationRecruitmentResponse;
import com.aliyuncs.dt_oc_info.model.v20220829.GetOcOperationRecruitmentResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOcOperationRecruitmentResponseUnmarshaller {

	public static GetOcOperationRecruitmentResponse unmarshall(GetOcOperationRecruitmentResponse getOcOperationRecruitmentResponse, UnmarshallerContext _ctx) {
		
		getOcOperationRecruitmentResponse.setRequestId(_ctx.stringValue("GetOcOperationRecruitmentResponse.RequestId"));
		getOcOperationRecruitmentResponse.setCode(_ctx.stringValue("GetOcOperationRecruitmentResponse.Code"));
		getOcOperationRecruitmentResponse.setSuccess(_ctx.booleanValue("GetOcOperationRecruitmentResponse.Success"));
		getOcOperationRecruitmentResponse.setMessage(_ctx.stringValue("GetOcOperationRecruitmentResponse.Message"));
		getOcOperationRecruitmentResponse.setTotalNum(_ctx.integerValue("GetOcOperationRecruitmentResponse.TotalNum"));
		getOcOperationRecruitmentResponse.setPageIndex(_ctx.integerValue("GetOcOperationRecruitmentResponse.PageIndex"));
		getOcOperationRecruitmentResponse.setPageNum(_ctx.integerValue("GetOcOperationRecruitmentResponse.PageNum"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetOcOperationRecruitmentResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setEntName(_ctx.stringValue("GetOcOperationRecruitmentResponse.Data["+ i +"].EntName"));
			dataItem.setRecruitingName(_ctx.stringValue("GetOcOperationRecruitmentResponse.Data["+ i +"].RecruitingName"));
			dataItem.setDescription(_ctx.stringValue("GetOcOperationRecruitmentResponse.Data["+ i +"].Description"));
			dataItem.setSalary(_ctx.stringValue("GetOcOperationRecruitmentResponse.Data["+ i +"].Salary"));
			dataItem.setRecruitingAddress(_ctx.stringValue("GetOcOperationRecruitmentResponse.Data["+ i +"].RecruitingAddress"));
			dataItem.setEducation(_ctx.stringValue("GetOcOperationRecruitmentResponse.Data["+ i +"].Education"));
			dataItem.setExperience(_ctx.stringValue("GetOcOperationRecruitmentResponse.Data["+ i +"].Experience"));
			dataItem.setBenefitList(_ctx.stringValue("GetOcOperationRecruitmentResponse.Data["+ i +"].BenefitList"));
			dataItem.setPublishDate(_ctx.stringValue("GetOcOperationRecruitmentResponse.Data["+ i +"].PublishDate"));
			dataItem.setStartDate(_ctx.stringValue("GetOcOperationRecruitmentResponse.Data["+ i +"].StartDate"));
			dataItem.setEndDate(_ctx.stringValue("GetOcOperationRecruitmentResponse.Data["+ i +"].EndDate"));
			dataItem.setPageUrl(_ctx.stringValue("GetOcOperationRecruitmentResponse.Data["+ i +"].PageUrl"));

			data.add(dataItem);
		}
		getOcOperationRecruitmentResponse.setData(data);
	 
	 	return getOcOperationRecruitmentResponse;
	}
}