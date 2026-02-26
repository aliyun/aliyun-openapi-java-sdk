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

package com.aliyuncs.viapi_regen.transform.v20211119;

import com.aliyuncs.viapi_regen.model.v20211119.GetLabelsetResponse;
import com.aliyuncs.viapi_regen.model.v20211119.GetLabelsetResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLabelsetResponseUnmarshaller {

	public static GetLabelsetResponse unmarshall(GetLabelsetResponse getLabelsetResponse, UnmarshallerContext _ctx) {
		
		getLabelsetResponse.setRequestId(_ctx.stringValue("GetLabelsetResponse.RequestId"));
		getLabelsetResponse.setMessage(_ctx.stringValue("GetLabelsetResponse.Message"));
		getLabelsetResponse.setCode(_ctx.stringValue("GetLabelsetResponse.Code"));

		Data data = new Data();
		data.setId(_ctx.longValue("GetLabelsetResponse.Data.Id"));
		data.setGmtCreate(_ctx.longValue("GetLabelsetResponse.Data.GmtCreate"));
		data.setName(_ctx.stringValue("GetLabelsetResponse.Data.Name"));
		data.setDescription(_ctx.stringValue("GetLabelsetResponse.Data.Description"));
		data.setLabelType(_ctx.stringValue("GetLabelsetResponse.Data.LabelType"));
		data.setTagUserList(_ctx.stringValue("GetLabelsetResponse.Data.TagUserList"));
		data.setTags(_ctx.stringValue("GetLabelsetResponse.Data.Tags"));
		data.setSubTaskPackageSize(_ctx.stringValue("GetLabelsetResponse.Data.SubTaskPackageSize"));
		data.setStatus(_ctx.stringValue("GetLabelsetResponse.Data.Status"));
		data.setTotal(_ctx.longValue("GetLabelsetResponse.Data.Total"));
		getLabelsetResponse.setData(data);
	 
	 	return getLabelsetResponse;
	}
}