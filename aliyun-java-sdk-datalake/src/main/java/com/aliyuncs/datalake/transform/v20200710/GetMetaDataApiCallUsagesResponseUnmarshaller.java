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

package com.aliyuncs.datalake.transform.v20200710;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.datalake.model.v20200710.GetMetaDataApiCallUsagesResponse;
import com.aliyuncs.datalake.model.v20200710.GetMetaDataApiCallUsagesResponse.MetaDataApiCallUsage;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMetaDataApiCallUsagesResponseUnmarshaller {

	public static GetMetaDataApiCallUsagesResponse unmarshall(GetMetaDataApiCallUsagesResponse getMetaDataApiCallUsagesResponse, UnmarshallerContext _ctx) {
		
		getMetaDataApiCallUsagesResponse.setRequestId(_ctx.stringValue("GetMetaDataApiCallUsagesResponse.RequestId"));
		getMetaDataApiCallUsagesResponse.setTotalCount(_ctx.integerValue("GetMetaDataApiCallUsagesResponse.TotalCount"));
		getMetaDataApiCallUsagesResponse.setSuccess(_ctx.booleanValue("GetMetaDataApiCallUsagesResponse.Success"));

		List<MetaDataApiCallUsage> metaDataApiCallUsages = new ArrayList<MetaDataApiCallUsage>();
		for (int i = 0; i < _ctx.lengthValue("GetMetaDataApiCallUsagesResponse.MetaDataApiCallUsages.Length"); i++) {
			MetaDataApiCallUsage metaDataApiCallUsage = new MetaDataApiCallUsage();
			metaDataApiCallUsage.setQueryTime(_ctx.stringValue("GetMetaDataApiCallUsagesResponse.MetaDataApiCallUsages["+ i +"].QueryTime"));
			metaDataApiCallUsage.setMonth(_ctx.stringValue("GetMetaDataApiCallUsagesResponse.MetaDataApiCallUsages["+ i +"].Month"));
			metaDataApiCallUsage.setApiCall(_ctx.longValue("GetMetaDataApiCallUsagesResponse.MetaDataApiCallUsages["+ i +"].ApiCall"));

			metaDataApiCallUsages.add(metaDataApiCallUsage);
		}
		getMetaDataApiCallUsagesResponse.setMetaDataApiCallUsages(metaDataApiCallUsages);
	 
	 	return getMetaDataApiCallUsagesResponse;
	}
}