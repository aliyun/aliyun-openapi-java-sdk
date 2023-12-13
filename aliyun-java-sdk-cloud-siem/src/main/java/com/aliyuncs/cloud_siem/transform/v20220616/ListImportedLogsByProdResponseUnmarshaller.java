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

package com.aliyuncs.cloud_siem.transform.v20220616;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloud_siem.model.v20220616.ListImportedLogsByProdResponse;
import com.aliyuncs.cloud_siem.model.v20220616.ListImportedLogsByProdResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListImportedLogsByProdResponseUnmarshaller {

	public static ListImportedLogsByProdResponse unmarshall(ListImportedLogsByProdResponse listImportedLogsByProdResponse, UnmarshallerContext _ctx) {
		
		listImportedLogsByProdResponse.setRequestId(_ctx.stringValue("ListImportedLogsByProdResponse.RequestId"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListImportedLogsByProdResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setProdCode(_ctx.stringValue("ListImportedLogsByProdResponse.Data["+ i +"].ProdCode"));
			dataItem.setLogCode(_ctx.stringValue("ListImportedLogsByProdResponse.Data["+ i +"].LogCode"));
			dataItem.setLogMdsCode(_ctx.stringValue("ListImportedLogsByProdResponse.Data["+ i +"].LogMdsCode"));
			dataItem.setImportedUserCount(_ctx.integerValue("ListImportedLogsByProdResponse.Data["+ i +"].ImportedUserCount"));
			dataItem.setUnImportedUserCount(_ctx.integerValue("ListImportedLogsByProdResponse.Data["+ i +"].UnImportedUserCount"));
			dataItem.setTotalUserCount(_ctx.integerValue("ListImportedLogsByProdResponse.Data["+ i +"].TotalUserCount"));
			dataItem.setModifyTime(_ctx.stringValue("ListImportedLogsByProdResponse.Data["+ i +"].ModifyTime"));
			dataItem.setImported(_ctx.integerValue("ListImportedLogsByProdResponse.Data["+ i +"].Imported"));
			dataItem.setAutoImported(_ctx.integerValue("ListImportedLogsByProdResponse.Data["+ i +"].AutoImported"));
			dataItem.setCloudCode(_ctx.stringValue("ListImportedLogsByProdResponse.Data["+ i +"].CloudCode"));

			data.add(dataItem);
		}
		listImportedLogsByProdResponse.setData(data);
	 
	 	return listImportedLogsByProdResponse;
	}
}