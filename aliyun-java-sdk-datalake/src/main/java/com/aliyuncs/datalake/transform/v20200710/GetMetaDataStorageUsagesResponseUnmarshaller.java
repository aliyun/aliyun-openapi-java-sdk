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

import com.aliyuncs.datalake.model.v20200710.GetMetaDataStorageUsagesResponse;
import com.aliyuncs.datalake.model.v20200710.GetMetaDataStorageUsagesResponse.MetaDataStorageUsage;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMetaDataStorageUsagesResponseUnmarshaller {

	public static GetMetaDataStorageUsagesResponse unmarshall(GetMetaDataStorageUsagesResponse getMetaDataStorageUsagesResponse, UnmarshallerContext _ctx) {
		
		getMetaDataStorageUsagesResponse.setRequestId(_ctx.stringValue("GetMetaDataStorageUsagesResponse.RequestId"));
		getMetaDataStorageUsagesResponse.setTotalCount(_ctx.stringValue("GetMetaDataStorageUsagesResponse.TotalCount"));
		getMetaDataStorageUsagesResponse.setSuccess(_ctx.booleanValue("GetMetaDataStorageUsagesResponse.Success"));

		List<MetaDataStorageUsage> metaDataStorageUsages = new ArrayList<MetaDataStorageUsage>();
		for (int i = 0; i < _ctx.lengthValue("GetMetaDataStorageUsagesResponse.MetaDataStorageUsages.Length"); i++) {
			MetaDataStorageUsage metaDataStorageUsage = new MetaDataStorageUsage();
			metaDataStorageUsage.setQueryTime(_ctx.stringValue("GetMetaDataStorageUsagesResponse.MetaDataStorageUsages["+ i +"].QueryTime"));
			metaDataStorageUsage.setMonth(_ctx.stringValue("GetMetaDataStorageUsagesResponse.MetaDataStorageUsages["+ i +"].Month"));
			metaDataStorageUsage.setStorageUsage(_ctx.longValue("GetMetaDataStorageUsagesResponse.MetaDataStorageUsages["+ i +"].StorageUsage"));
			metaDataStorageUsage.setCatalog(_ctx.longValue("GetMetaDataStorageUsagesResponse.MetaDataStorageUsages["+ i +"].Catalog"));
			metaDataStorageUsage.setDatabase(_ctx.longValue("GetMetaDataStorageUsagesResponse.MetaDataStorageUsages["+ i +"].Database"));
			metaDataStorageUsage.setTable(_ctx.longValue("GetMetaDataStorageUsagesResponse.MetaDataStorageUsages["+ i +"].Table"));
			metaDataStorageUsage.setPartition(_ctx.longValue("GetMetaDataStorageUsagesResponse.MetaDataStorageUsages["+ i +"].Partition"));
			metaDataStorageUsage.setFunction(_ctx.longValue("GetMetaDataStorageUsagesResponse.MetaDataStorageUsages["+ i +"].Function"));

			metaDataStorageUsages.add(metaDataStorageUsage);
		}
		getMetaDataStorageUsagesResponse.setMetaDataStorageUsages(metaDataStorageUsages);
	 
	 	return getMetaDataStorageUsagesResponse;
	}
}