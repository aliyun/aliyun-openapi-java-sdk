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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.ListAuthorizedDataServiceApiDetailsResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListAuthorizedDataServiceApiDetailsResponse.Result;
import com.aliyuncs.dataphin_public.model.v20230630.ListAuthorizedDataServiceApiDetailsResponse.Result.ApiAuthDetail;
import com.aliyuncs.dataphin_public.model.v20230630.ListAuthorizedDataServiceApiDetailsResponse.Result.ApiAuthDetail.DevReturnParameters;
import com.aliyuncs.dataphin_public.model.v20230630.ListAuthorizedDataServiceApiDetailsResponse.Result.ApiAuthDetail.ProdReturnParameters;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAuthorizedDataServiceApiDetailsResponseUnmarshaller {

	public static ListAuthorizedDataServiceApiDetailsResponse unmarshall(ListAuthorizedDataServiceApiDetailsResponse listAuthorizedDataServiceApiDetailsResponse, UnmarshallerContext _ctx) {
		
		listAuthorizedDataServiceApiDetailsResponse.setRequestId(_ctx.stringValue("ListAuthorizedDataServiceApiDetailsResponse.RequestId"));
		listAuthorizedDataServiceApiDetailsResponse.setMessage(_ctx.stringValue("ListAuthorizedDataServiceApiDetailsResponse.Message"));
		listAuthorizedDataServiceApiDetailsResponse.setHttpStatusCode(_ctx.integerValue("ListAuthorizedDataServiceApiDetailsResponse.HttpStatusCode"));
		listAuthorizedDataServiceApiDetailsResponse.setCode(_ctx.stringValue("ListAuthorizedDataServiceApiDetailsResponse.Code"));
		listAuthorizedDataServiceApiDetailsResponse.setSuccess(_ctx.booleanValue("ListAuthorizedDataServiceApiDetailsResponse.Success"));

		Result result = new Result();
		result.setTotalCount(_ctx.longValue("ListAuthorizedDataServiceApiDetailsResponse.Result.TotalCount"));

		List<ApiAuthDetail> data = new ArrayList<ApiAuthDetail>();
		for (int i = 0; i < _ctx.lengthValue("ListAuthorizedDataServiceApiDetailsResponse.Result.Data.Length"); i++) {
			ApiAuthDetail apiAuthDetail = new ApiAuthDetail();
			apiAuthDetail.setDescription(_ctx.stringValue("ListAuthorizedDataServiceApiDetailsResponse.Result.Data["+ i +"].Description"));
			apiAuthDetail.setAppId(_ctx.longValue("ListAuthorizedDataServiceApiDetailsResponse.Result.Data["+ i +"].AppId"));
			apiAuthDetail.setApiName(_ctx.stringValue("ListAuthorizedDataServiceApiDetailsResponse.Result.Data["+ i +"].ApiName"));
			apiAuthDetail.setProjectId(_ctx.longValue("ListAuthorizedDataServiceApiDetailsResponse.Result.Data["+ i +"].ProjectId"));
			apiAuthDetail.setProdAuthPeriod(_ctx.stringValue("ListAuthorizedDataServiceApiDetailsResponse.Result.Data["+ i +"].ProdAuthPeriod"));
			apiAuthDetail.setAuthType(_ctx.stringValue("ListAuthorizedDataServiceApiDetailsResponse.Result.Data["+ i +"].AuthType"));
			apiAuthDetail.setApiId(_ctx.longValue("ListAuthorizedDataServiceApiDetailsResponse.Result.Data["+ i +"].ApiId"));
			apiAuthDetail.setDevAuthPeriod(_ctx.stringValue("ListAuthorizedDataServiceApiDetailsResponse.Result.Data["+ i +"].DevAuthPeriod"));

			List<ProdReturnParameters> authorizedProdReturnParameters = new ArrayList<ProdReturnParameters>();
			for (int j = 0; j < _ctx.lengthValue("ListAuthorizedDataServiceApiDetailsResponse.Result.Data["+ i +"].AuthorizedProdReturnParameters.Length"); j++) {
				ProdReturnParameters prodReturnParameters = new ProdReturnParameters();
				prodReturnParameters.setExampleValue(_ctx.stringValue("ListAuthorizedDataServiceApiDetailsResponse.Result.Data["+ i +"].AuthorizedProdReturnParameters["+ j +"].ExampleValue"));
				prodReturnParameters.setIsAuthorized(_ctx.integerValue("ListAuthorizedDataServiceApiDetailsResponse.Result.Data["+ i +"].AuthorizedProdReturnParameters["+ j +"].IsAuthorized"));
				prodReturnParameters.setParameterDataType(_ctx.integerValue("ListAuthorizedDataServiceApiDetailsResponse.Result.Data["+ i +"].AuthorizedProdReturnParameters["+ j +"].ParameterDataType"));
				prodReturnParameters.setParameterName(_ctx.stringValue("ListAuthorizedDataServiceApiDetailsResponse.Result.Data["+ i +"].AuthorizedProdReturnParameters["+ j +"].ParameterName"));
				prodReturnParameters.setParameterDescription(_ctx.stringValue("ListAuthorizedDataServiceApiDetailsResponse.Result.Data["+ i +"].AuthorizedProdReturnParameters["+ j +"].ParameterDescription"));

				authorizedProdReturnParameters.add(prodReturnParameters);
			}
			apiAuthDetail.setAuthorizedProdReturnParameters(authorizedProdReturnParameters);

			List<DevReturnParameters> authorizedDevReturnParameters = new ArrayList<DevReturnParameters>();
			for (int j = 0; j < _ctx.lengthValue("ListAuthorizedDataServiceApiDetailsResponse.Result.Data["+ i +"].AuthorizedDevReturnParameters.Length"); j++) {
				DevReturnParameters devReturnParameters = new DevReturnParameters();
				devReturnParameters.setExampleValue(_ctx.stringValue("ListAuthorizedDataServiceApiDetailsResponse.Result.Data["+ i +"].AuthorizedDevReturnParameters["+ j +"].ExampleValue"));
				devReturnParameters.setIsAuthorized(_ctx.integerValue("ListAuthorizedDataServiceApiDetailsResponse.Result.Data["+ i +"].AuthorizedDevReturnParameters["+ j +"].IsAuthorized"));
				devReturnParameters.setParameterDataType(_ctx.integerValue("ListAuthorizedDataServiceApiDetailsResponse.Result.Data["+ i +"].AuthorizedDevReturnParameters["+ j +"].ParameterDataType"));
				devReturnParameters.setParameterName(_ctx.stringValue("ListAuthorizedDataServiceApiDetailsResponse.Result.Data["+ i +"].AuthorizedDevReturnParameters["+ j +"].ParameterName"));
				devReturnParameters.setParameterDescription(_ctx.stringValue("ListAuthorizedDataServiceApiDetailsResponse.Result.Data["+ i +"].AuthorizedDevReturnParameters["+ j +"].ParameterDescription"));

				authorizedDevReturnParameters.add(devReturnParameters);
			}
			apiAuthDetail.setAuthorizedDevReturnParameters(authorizedDevReturnParameters);

			data.add(apiAuthDetail);
		}
		result.setData(data);
		listAuthorizedDataServiceApiDetailsResponse.setResult(result);
	 
	 	return listAuthorizedDataServiceApiDetailsResponse;
	}
}