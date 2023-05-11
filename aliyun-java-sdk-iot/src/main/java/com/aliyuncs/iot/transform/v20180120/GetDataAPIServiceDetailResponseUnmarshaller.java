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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.GetDataAPIServiceDetailResponse;
import com.aliyuncs.iot.model.v20180120.GetDataAPIServiceDetailResponse.Data;
import com.aliyuncs.iot.model.v20180120.GetDataAPIServiceDetailResponse.Data.SqlTemplateDTO;
import com.aliyuncs.iot.model.v20180120.GetDataAPIServiceDetailResponse.Data.SqlTemplateDTO.RequestParamsItem;
import com.aliyuncs.iot.model.v20180120.GetDataAPIServiceDetailResponse.Data.SqlTemplateDTO.ResponseParamsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDataAPIServiceDetailResponseUnmarshaller {

	public static GetDataAPIServiceDetailResponse unmarshall(GetDataAPIServiceDetailResponse getDataAPIServiceDetailResponse, UnmarshallerContext _ctx) {
		
		getDataAPIServiceDetailResponse.setRequestId(_ctx.stringValue("GetDataAPIServiceDetailResponse.RequestId"));
		getDataAPIServiceDetailResponse.setSuccess(_ctx.booleanValue("GetDataAPIServiceDetailResponse.Success"));
		getDataAPIServiceDetailResponse.setCode(_ctx.stringValue("GetDataAPIServiceDetailResponse.Code"));
		getDataAPIServiceDetailResponse.setErrorMessage(_ctx.stringValue("GetDataAPIServiceDetailResponse.ErrorMessage"));

		Data data = new Data();
		data.setApiSrn(_ctx.stringValue("GetDataAPIServiceDetailResponse.Data.ApiSrn"));
		data.setStatus(_ctx.integerValue("GetDataAPIServiceDetailResponse.Data.Status"));
		data.setDisplayName(_ctx.stringValue("GetDataAPIServiceDetailResponse.Data.DisplayName"));
		data.setApiPath(_ctx.stringValue("GetDataAPIServiceDetailResponse.Data.ApiPath"));
		data.setCreateTime(_ctx.longValue("GetDataAPIServiceDetailResponse.Data.CreateTime"));
		data.setLastUpdateTime(_ctx.longValue("GetDataAPIServiceDetailResponse.Data.LastUpdateTime"));
		data.setDateFormat(_ctx.stringValue("GetDataAPIServiceDetailResponse.Data.DateFormat"));
		data.setRequestMethod(_ctx.stringValue("GetDataAPIServiceDetailResponse.Data.RequestMethod"));
		data.setRequestProtocol(_ctx.stringValue("GetDataAPIServiceDetailResponse.Data.RequestProtocol"));
		data.setDescription(_ctx.stringValue("GetDataAPIServiceDetailResponse.Data.Description"));

		SqlTemplateDTO sqlTemplateDTO = new SqlTemplateDTO();
		sqlTemplateDTO.setOriginSql(_ctx.stringValue("GetDataAPIServiceDetailResponse.Data.SqlTemplateDTO.OriginSql"));
		sqlTemplateDTO.setTemplateSql(_ctx.stringValue("GetDataAPIServiceDetailResponse.Data.SqlTemplateDTO.TemplateSql"));

		List<RequestParamsItem> requestParams = new ArrayList<RequestParamsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetDataAPIServiceDetailResponse.Data.SqlTemplateDTO.RequestParams.Length"); i++) {
			RequestParamsItem requestParamsItem = new RequestParamsItem();
			requestParamsItem.setName(_ctx.stringValue("GetDataAPIServiceDetailResponse.Data.SqlTemplateDTO.RequestParams["+ i +"].Name"));
			requestParamsItem.setType(_ctx.stringValue("GetDataAPIServiceDetailResponse.Data.SqlTemplateDTO.RequestParams["+ i +"].Type"));
			requestParamsItem.setDesc(_ctx.stringValue("GetDataAPIServiceDetailResponse.Data.SqlTemplateDTO.RequestParams["+ i +"].Desc"));
			requestParamsItem.setExample(_ctx.stringValue("GetDataAPIServiceDetailResponse.Data.SqlTemplateDTO.RequestParams["+ i +"].Example"));
			requestParamsItem.setRequired(_ctx.booleanValue("GetDataAPIServiceDetailResponse.Data.SqlTemplateDTO.RequestParams["+ i +"].Required"));

			requestParams.add(requestParamsItem);
		}
		sqlTemplateDTO.setRequestParams(requestParams);

		List<ResponseParamsItem> responseParams = new ArrayList<ResponseParamsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetDataAPIServiceDetailResponse.Data.SqlTemplateDTO.ResponseParams.Length"); i++) {
			ResponseParamsItem responseParamsItem = new ResponseParamsItem();
			responseParamsItem.setName(_ctx.stringValue("GetDataAPIServiceDetailResponse.Data.SqlTemplateDTO.ResponseParams["+ i +"].Name"));
			responseParamsItem.setType(_ctx.stringValue("GetDataAPIServiceDetailResponse.Data.SqlTemplateDTO.ResponseParams["+ i +"].Type"));
			responseParamsItem.setDesc(_ctx.stringValue("GetDataAPIServiceDetailResponse.Data.SqlTemplateDTO.ResponseParams["+ i +"].Desc"));
			responseParamsItem.setExample(_ctx.stringValue("GetDataAPIServiceDetailResponse.Data.SqlTemplateDTO.ResponseParams["+ i +"].Example"));
			responseParamsItem.setRequired(_ctx.booleanValue("GetDataAPIServiceDetailResponse.Data.SqlTemplateDTO.ResponseParams["+ i +"].Required"));

			responseParams.add(responseParamsItem);
		}
		sqlTemplateDTO.setResponseParams(responseParams);
		data.setSqlTemplateDTO(sqlTemplateDTO);
		getDataAPIServiceDetailResponse.setData(data);
	 
	 	return getDataAPIServiceDetailResponse;
	}
}