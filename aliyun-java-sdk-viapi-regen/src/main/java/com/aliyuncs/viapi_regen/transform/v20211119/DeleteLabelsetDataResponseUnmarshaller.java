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

import com.aliyuncs.viapi_regen.model.v20211119.DeleteLabelsetDataResponse;
import com.aliyuncs.viapi_regen.model.v20211119.DeleteLabelsetDataResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLabelsetDataResponseUnmarshaller {

	public static DeleteLabelsetDataResponse unmarshall(DeleteLabelsetDataResponse deleteLabelsetDataResponse, UnmarshallerContext _ctx) {
		
		deleteLabelsetDataResponse.setRequestId(_ctx.stringValue("DeleteLabelsetDataResponse.RequestId"));
		deleteLabelsetDataResponse.setMessage(_ctx.stringValue("DeleteLabelsetDataResponse.Message"));
		deleteLabelsetDataResponse.setCode(_ctx.stringValue("DeleteLabelsetDataResponse.Code"));

		Data data = new Data();
		data.setId(_ctx.longValue("DeleteLabelsetDataResponse.Data.Id"));
		data.setGmtCreate(_ctx.longValue("DeleteLabelsetDataResponse.Data.GmtCreate"));
		data.setName(_ctx.stringValue("DeleteLabelsetDataResponse.Data.Name"));
		data.setDescription(_ctx.stringValue("DeleteLabelsetDataResponse.Data.Description"));
		data.setLabelType(_ctx.stringValue("DeleteLabelsetDataResponse.Data.LabelType"));
		data.setStatus(_ctx.stringValue("DeleteLabelsetDataResponse.Data.Status"));
		data.setTotal(_ctx.longValue("DeleteLabelsetDataResponse.Data.Total"));
		deleteLabelsetDataResponse.setData(data);
	 
	 	return deleteLabelsetDataResponse;
	}
}