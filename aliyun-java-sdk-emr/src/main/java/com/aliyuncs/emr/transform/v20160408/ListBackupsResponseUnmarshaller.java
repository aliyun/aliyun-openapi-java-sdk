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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListBackupsResponse;
import com.aliyuncs.emr.model.v20160408.ListBackupsResponse.Item;
import com.aliyuncs.emr.model.v20160408.ListBackupsResponse.Item.MetadataInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBackupsResponseUnmarshaller {

	public static ListBackupsResponse unmarshall(ListBackupsResponse listBackupsResponse, UnmarshallerContext _ctx) {
		
		listBackupsResponse.setRequestId(_ctx.stringValue("ListBackupsResponse.RequestId"));
		listBackupsResponse.setPageNumber(_ctx.integerValue("ListBackupsResponse.PageNumber"));
		listBackupsResponse.setPageSize(_ctx.integerValue("ListBackupsResponse.PageSize"));
		listBackupsResponse.setTotalCount(_ctx.integerValue("ListBackupsResponse.TotalCount"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("ListBackupsResponse.Items.Length"); i++) {
			Item item = new Item();
			item.setId(_ctx.stringValue("ListBackupsResponse.Items["+ i +"].Id"));
			item.setBackupPlanId(_ctx.stringValue("ListBackupsResponse.Items["+ i +"].BackupPlanId"));
			item.setClusterId(_ctx.stringValue("ListBackupsResponse.Items["+ i +"].ClusterId"));
			item.setCreateTime(_ctx.longValue("ListBackupsResponse.Items["+ i +"].CreateTime"));
			item.setMd5(_ctx.stringValue("ListBackupsResponse.Items["+ i +"].Md5"));
			item.setTarFileName(_ctx.stringValue("ListBackupsResponse.Items["+ i +"].TarFileName"));
			item.setStorePath(_ctx.stringValue("ListBackupsResponse.Items["+ i +"].StorePath"));
			item.setStatus(_ctx.stringValue("ListBackupsResponse.Items["+ i +"].Status"));

			MetadataInfo metadataInfo = new MetadataInfo();
			metadataInfo.setMetadataType(_ctx.stringValue("ListBackupsResponse.Items["+ i +"].MetadataInfo.MetadataType"));
			metadataInfo.setProperties(_ctx.stringValue("ListBackupsResponse.Items["+ i +"].MetadataInfo.Properties"));
			item.setMetadataInfo(metadataInfo);

			items.add(item);
		}
		listBackupsResponse.setItems(items);
	 
	 	return listBackupsResponse;
	}
}