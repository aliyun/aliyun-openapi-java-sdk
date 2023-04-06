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

package com.aliyuncs.dashscope.transform.v20230320;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dashscope.model.v20230320.QueryOpenStatusResponse;
import com.aliyuncs.dashscope.model.v20230320.QueryOpenStatusResponse.Data;
import com.aliyuncs.dashscope.model.v20230320.QueryOpenStatusResponse.Data.CommoditiyOpenStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryOpenStatusResponseUnmarshaller {

	public static QueryOpenStatusResponse unmarshall(QueryOpenStatusResponse queryOpenStatusResponse, UnmarshallerContext _ctx) {
		
		queryOpenStatusResponse.setRequestId(_ctx.stringValue("QueryOpenStatusResponse.RequestId"));
		queryOpenStatusResponse.setSuccess(_ctx.booleanValue("QueryOpenStatusResponse.Success"));
		queryOpenStatusResponse.setHttpCode(_ctx.stringValue("QueryOpenStatusResponse.HttpCode"));
		queryOpenStatusResponse.setErrorCode(_ctx.stringValue("QueryOpenStatusResponse.ErrorCode"));
		queryOpenStatusResponse.setErrorMessage(_ctx.stringValue("QueryOpenStatusResponse.ErrorMessage"));
		queryOpenStatusResponse.setAccessDeniedDetail(_ctx.stringValue("QueryOpenStatusResponse.AccessDeniedDetail"));

		Data data = new Data();

		List<CommoditiyOpenStatus> commoditiesOpenStatus = new ArrayList<CommoditiyOpenStatus>();
		for (int i = 0; i < _ctx.lengthValue("QueryOpenStatusResponse.Data.CommoditiesOpenStatus.Length"); i++) {
			CommoditiyOpenStatus commoditiyOpenStatus = new CommoditiyOpenStatus();
			commoditiyOpenStatus.setCommodity(_ctx.stringValue("QueryOpenStatusResponse.Data.CommoditiesOpenStatus["+ i +"].Commodity"));
			commoditiyOpenStatus.setOpen(_ctx.booleanValue("QueryOpenStatusResponse.Data.CommoditiesOpenStatus["+ i +"].Open"));
			commoditiyOpenStatus.setStop(_ctx.booleanValue("QueryOpenStatusResponse.Data.CommoditiesOpenStatus["+ i +"].Stop"));
			commoditiyOpenStatus.setCnName(_ctx.stringValue("QueryOpenStatusResponse.Data.CommoditiesOpenStatus["+ i +"].CnName"));
			commoditiyOpenStatus.setDescribe(_ctx.stringValue("QueryOpenStatusResponse.Data.CommoditiesOpenStatus["+ i +"].Describe"));
			commoditiyOpenStatus.setDetailPage(_ctx.stringValue("QueryOpenStatusResponse.Data.CommoditiesOpenStatus["+ i +"].DetailPage"));
			commoditiyOpenStatus.setOpenTime(_ctx.stringValue("QueryOpenStatusResponse.Data.CommoditiesOpenStatus["+ i +"].OpenTime"));
			commoditiyOpenStatus.setOpenPage(_ctx.stringValue("QueryOpenStatusResponse.Data.CommoditiesOpenStatus["+ i +"].OpenPage"));

			commoditiesOpenStatus.add(commoditiyOpenStatus);
		}
		data.setCommoditiesOpenStatus(commoditiesOpenStatus);
		queryOpenStatusResponse.setData(data);
	 
	 	return queryOpenStatusResponse;
	}
}