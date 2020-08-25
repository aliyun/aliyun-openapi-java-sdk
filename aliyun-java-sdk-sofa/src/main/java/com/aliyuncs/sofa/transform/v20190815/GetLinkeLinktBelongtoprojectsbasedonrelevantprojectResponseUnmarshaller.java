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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponseUnmarshaller {

	public static GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponse unmarshall(GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponse getLinkeLinktBelongtoprojectsbasedonrelevantprojectResponse, UnmarshallerContext _ctx) {
		
		getLinkeLinktBelongtoprojectsbasedonrelevantprojectResponse.setRequestId(_ctx.stringValue("GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponse.RequestId"));
		getLinkeLinktBelongtoprojectsbasedonrelevantprojectResponse.setResultCode(_ctx.stringValue("GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponse.ResultCode"));
		getLinkeLinktBelongtoprojectsbasedonrelevantprojectResponse.setResultMessage(_ctx.stringValue("GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponse.ResultMessage"));
		getLinkeLinktBelongtoprojectsbasedonrelevantprojectResponse.setErrorCode(_ctx.longValue("GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponse.ErrorCode"));
		getLinkeLinktBelongtoprojectsbasedonrelevantprojectResponse.setErrorMessage(_ctx.stringValue("GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponse.ErrorMessage"));
		getLinkeLinktBelongtoprojectsbasedonrelevantprojectResponse.setResponseStatusCode(_ctx.longValue("GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponse.ResponseStatusCode"));
		getLinkeLinktBelongtoprojectsbasedonrelevantprojectResponse.setSuccess(_ctx.booleanValue("GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setArchive(_ctx.booleanValue("GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponse.Data["+ i +"].Archive"));
			dataItem.setAsPublic(_ctx.booleanValue("GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponse.Data["+ i +"].AsPublic"));
			dataItem.setCreatedAt(_ctx.longValue("GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponse.Data["+ i +"].CreatedAt"));
			dataItem.setCreator(_ctx.stringValue("GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponse.Data["+ i +"].Creator"));
			dataItem.setDeleted(_ctx.booleanValue("GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponse.Data["+ i +"].Deleted"));
			dataItem.setDescription(_ctx.stringValue("GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponse.Data["+ i +"].Description"));
			dataItem.setId(_ctx.longValue("GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponse.Data["+ i +"].Id"));
			dataItem.setLink(_ctx.stringValue("GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponse.Data["+ i +"].Link"));
			dataItem.setName(_ctx.stringValue("GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponse.Data["+ i +"].Name"));
			dataItem.setParentSign(_ctx.stringValue("GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponse.Data["+ i +"].ParentSign"));
			dataItem.setSign(_ctx.stringValue("GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponse.Data["+ i +"].Sign"));
			dataItem.setSignPath(_ctx.stringValue("GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponse.Data["+ i +"].SignPath"));
			dataItem.setUpdatedAt(_ctx.longValue("GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponse.Data["+ i +"].UpdatedAt"));
			dataItem.setUrl(_ctx.stringValue("GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponse.Data["+ i +"].Url"));

			data.add(dataItem);
		}
		getLinkeLinktBelongtoprojectsbasedonrelevantprojectResponse.setData(data);
	 
	 	return getLinkeLinktBelongtoprojectsbasedonrelevantprojectResponse;
	}
}