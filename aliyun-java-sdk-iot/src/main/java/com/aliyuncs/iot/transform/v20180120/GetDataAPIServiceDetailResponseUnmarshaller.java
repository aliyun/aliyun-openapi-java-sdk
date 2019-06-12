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

	public static GetDataAPIServiceDetailResponse unmarshall(GetDataAPIServiceDetailResponse getDataAPIServiceDetailResponse, UnmarshallerContext context) {
		
		getDataAPIServiceDetailResponse.setRequestId(context.stringValue("GetDataAPIServiceDetailResponse.RequestId"));
		getDataAPIServiceDetailResponse.setSuccess(context.booleanValue("GetDataAPIServiceDetailResponse.Success"));
		getDataAPIServiceDetailResponse.setErrorMessage(context.stringValue("GetDataAPIServiceDetailResponse.ErrorMessage"));
		getDataAPIServiceDetailResponse.setCode(context.stringValue("GetDataAPIServiceDetailResponse.Code"));

		Data data = new Data();
		data.setApiSrn(context.stringValue("GetDataAPIServiceDetailResponse.Data.ApiSrn"));
		data.setStatus(context.integerValue("GetDataAPIServiceDetailResponse.Data.Status"));
		data.setDisplayName(context.stringValue("GetDataAPIServiceDetailResponse.Data.DisplayName"));
		data.setApiPath(context.stringValue("GetDataAPIServiceDetailResponse.Data.ApiPath"));
		data.setCreateTime(context.longValue("GetDataAPIServiceDetailResponse.Data.CreateTime"));
		data.setLastUpdateTime(context.longValue("GetDataAPIServiceDetailResponse.Data.LastUpdateTime"));
		data.setDateFormat(context.stringValue("GetDataAPIServiceDetailResponse.Data.DateFormat"));
		data.setRequestMethod(context.stringValue("GetDataAPIServiceDetailResponse.Data.RequestMethod"));
		data.setRequestProtocol(context.stringValue("GetDataAPIServiceDetailResponse.Data.RequestProtocol"));
		data.setDescription(context.stringValue("GetDataAPIServiceDetailResponse.Data.Description"));

		SqlTemplateDTO sqlTemplateDTO = new SqlTemplateDTO();
		sqlTemplateDTO.setOriginSql(context.stringValue("GetDataAPIServiceDetailResponse.Data.SqlTemplateDTO.OriginSql"));
		sqlTemplateDTO.setTemplateSql(context.stringValue("GetDataAPIServiceDetailResponse.Data.SqlTemplateDTO.TemplateSql"));

		List<RequestParamsItem> requestParams = new ArrayList<RequestParamsItem>();
		for (int i = 0; i < context.lengthValue("GetDataAPIServiceDetailResponse.Data.SqlTemplateDTO.RequestParams.Length"); i++) {
			RequestParamsItem requestParamsItem = new RequestParamsItem();
			requestParamsItem.setName(context.stringValue("GetDataAPIServiceDetailResponse.Data.SqlTemplateDTO.RequestParams["+ i +"].Name"));
			requestParamsItem.setType(context.stringValue("GetDataAPIServiceDetailResponse.Data.SqlTemplateDTO.RequestParams["+ i +"].Type"));
			requestParamsItem.setDesc(context.stringValue("GetDataAPIServiceDetailResponse.Data.SqlTemplateDTO.RequestParams["+ i +"].Desc"));
			requestParamsItem.setExample(context.stringValue("GetDataAPIServiceDetailResponse.Data.SqlTemplateDTO.RequestParams["+ i +"].Example"));
			requestParamsItem.setRequired(context.booleanValue("GetDataAPIServiceDetailResponse.Data.SqlTemplateDTO.RequestParams["+ i +"].Required"));

			requestParams.add(requestParamsItem);
		}
		sqlTemplateDTO.setRequestParams(requestParams);

		List<ResponseParamsItem> responseParams = new ArrayList<ResponseParamsItem>();
		for (int i = 0; i < context.lengthValue("GetDataAPIServiceDetailResponse.Data.SqlTemplateDTO.ResponseParams.Length"); i++) {
			ResponseParamsItem responseParamsItem = new ResponseParamsItem();
			responseParamsItem.setName(context.stringValue("GetDataAPIServiceDetailResponse.Data.SqlTemplateDTO.ResponseParams["+ i +"].Name"));
			responseParamsItem.setType(context.stringValue("GetDataAPIServiceDetailResponse.Data.SqlTemplateDTO.ResponseParams["+ i +"].Type"));
			responseParamsItem.setDesc(context.stringValue("GetDataAPIServiceDetailResponse.Data.SqlTemplateDTO.ResponseParams["+ i +"].Desc"));
			responseParamsItem.setExample(context.stringValue("GetDataAPIServiceDetailResponse.Data.SqlTemplateDTO.ResponseParams["+ i +"].Example"));
			responseParamsItem.setRequired(context.booleanValue("GetDataAPIServiceDetailResponse.Data.SqlTemplateDTO.ResponseParams["+ i +"].Required"));

			responseParams.add(responseParamsItem);
		}
		sqlTemplateDTO.setResponseParams(responseParams);
		data.setSqlTemplateDTO(sqlTemplateDTO);
		getDataAPIServiceDetailResponse.setData(data);
	 
	 	return getDataAPIServiceDetailResponse;
	}
}