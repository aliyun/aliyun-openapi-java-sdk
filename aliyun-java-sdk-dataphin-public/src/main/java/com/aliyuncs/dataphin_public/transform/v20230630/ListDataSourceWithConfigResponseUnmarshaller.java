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

import com.aliyuncs.dataphin_public.model.v20230630.ListDataSourceWithConfigResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListDataSourceWithConfigResponse.PageResult;
import com.aliyuncs.dataphin_public.model.v20230630.ListDataSourceWithConfigResponse.PageResult.DevProdDataSource;
import com.aliyuncs.dataphin_public.model.v20230630.ListDataSourceWithConfigResponse.PageResult.DevProdDataSource.DevDataSourceInfo;
import com.aliyuncs.dataphin_public.model.v20230630.ListDataSourceWithConfigResponse.PageResult.DevProdDataSource.DevDataSourceInfo.ConfigItem2;
import com.aliyuncs.dataphin_public.model.v20230630.ListDataSourceWithConfigResponse.PageResult.DevProdDataSource.ProdDataSourceInfo;
import com.aliyuncs.dataphin_public.model.v20230630.ListDataSourceWithConfigResponse.PageResult.DevProdDataSource.ProdDataSourceInfo.ConfigItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDataSourceWithConfigResponseUnmarshaller {

	public static ListDataSourceWithConfigResponse unmarshall(ListDataSourceWithConfigResponse listDataSourceWithConfigResponse, UnmarshallerContext _ctx) {
		
		listDataSourceWithConfigResponse.setRequestId(_ctx.stringValue("ListDataSourceWithConfigResponse.RequestId"));
		listDataSourceWithConfigResponse.setSuccess(_ctx.booleanValue("ListDataSourceWithConfigResponse.Success"));
		listDataSourceWithConfigResponse.setHttpStatusCode(_ctx.integerValue("ListDataSourceWithConfigResponse.HttpStatusCode"));
		listDataSourceWithConfigResponse.setCode(_ctx.stringValue("ListDataSourceWithConfigResponse.Code"));
		listDataSourceWithConfigResponse.setMessage(_ctx.stringValue("ListDataSourceWithConfigResponse.Message"));

		PageResult pageResult = new PageResult();
		pageResult.setTotalCount(_ctx.longValue("ListDataSourceWithConfigResponse.PageResult.TotalCount"));

		List<DevProdDataSource> dataSourceList = new ArrayList<DevProdDataSource>();
		for (int i = 0; i < _ctx.lengthValue("ListDataSourceWithConfigResponse.PageResult.DataSourceList.Length"); i++) {
			DevProdDataSource devProdDataSource = new DevProdDataSource();

			ProdDataSourceInfo prodDataSourceInfo = new ProdDataSourceInfo();
			prodDataSourceInfo.setId(_ctx.longValue("ListDataSourceWithConfigResponse.PageResult.DataSourceList["+ i +"].ProdDataSourceInfo.Id"));
			prodDataSourceInfo.setName(_ctx.stringValue("ListDataSourceWithConfigResponse.PageResult.DataSourceList["+ i +"].ProdDataSourceInfo.Name"));
			prodDataSourceInfo.setType(_ctx.stringValue("ListDataSourceWithConfigResponse.PageResult.DataSourceList["+ i +"].ProdDataSourceInfo.Type"));
			prodDataSourceInfo.setScope(_ctx.stringValue("ListDataSourceWithConfigResponse.PageResult.DataSourceList["+ i +"].ProdDataSourceInfo.Scope"));
			prodDataSourceInfo.setCreateTime(_ctx.longValue("ListDataSourceWithConfigResponse.PageResult.DataSourceList["+ i +"].ProdDataSourceInfo.CreateTime"));
			prodDataSourceInfo.setModifyTime(_ctx.longValue("ListDataSourceWithConfigResponse.PageResult.DataSourceList["+ i +"].ProdDataSourceInfo.ModifyTime"));
			prodDataSourceInfo.setCreator(_ctx.stringValue("ListDataSourceWithConfigResponse.PageResult.DataSourceList["+ i +"].ProdDataSourceInfo.Creator"));
			prodDataSourceInfo.setCreatorName(_ctx.stringValue("ListDataSourceWithConfigResponse.PageResult.DataSourceList["+ i +"].ProdDataSourceInfo.CreatorName"));
			prodDataSourceInfo.setOwner(_ctx.stringValue("ListDataSourceWithConfigResponse.PageResult.DataSourceList["+ i +"].ProdDataSourceInfo.Owner"));
			prodDataSourceInfo.setOwnerName(_ctx.stringValue("ListDataSourceWithConfigResponse.PageResult.DataSourceList["+ i +"].ProdDataSourceInfo.OwnerName"));
			prodDataSourceInfo.setDescription(_ctx.stringValue("ListDataSourceWithConfigResponse.PageResult.DataSourceList["+ i +"].ProdDataSourceInfo.Description"));
			prodDataSourceInfo.setEnv(_ctx.stringValue("ListDataSourceWithConfigResponse.PageResult.DataSourceList["+ i +"].ProdDataSourceInfo.Env"));

			List<ConfigItem> configItemList = new ArrayList<ConfigItem>();
			for (int j = 0; j < _ctx.lengthValue("ListDataSourceWithConfigResponse.PageResult.DataSourceList["+ i +"].ProdDataSourceInfo.ConfigItemList.Length"); j++) {
				ConfigItem configItem = new ConfigItem();
				configItem.setKey(_ctx.stringValue("ListDataSourceWithConfigResponse.PageResult.DataSourceList["+ i +"].ProdDataSourceInfo.ConfigItemList["+ j +"].Key"));
				configItem.setValue(_ctx.stringValue("ListDataSourceWithConfigResponse.PageResult.DataSourceList["+ i +"].ProdDataSourceInfo.ConfigItemList["+ j +"].Value"));

				configItemList.add(configItem);
			}
			prodDataSourceInfo.setConfigItemList(configItemList);
			devProdDataSource.setProdDataSourceInfo(prodDataSourceInfo);

			DevDataSourceInfo devDataSourceInfo = new DevDataSourceInfo();
			devDataSourceInfo.setId(_ctx.longValue("ListDataSourceWithConfigResponse.PageResult.DataSourceList["+ i +"].DevDataSourceInfo.Id"));
			devDataSourceInfo.setName(_ctx.stringValue("ListDataSourceWithConfigResponse.PageResult.DataSourceList["+ i +"].DevDataSourceInfo.Name"));
			devDataSourceInfo.setType(_ctx.stringValue("ListDataSourceWithConfigResponse.PageResult.DataSourceList["+ i +"].DevDataSourceInfo.Type"));
			devDataSourceInfo.setScope(_ctx.stringValue("ListDataSourceWithConfigResponse.PageResult.DataSourceList["+ i +"].DevDataSourceInfo.Scope"));
			devDataSourceInfo.setCreateTime(_ctx.longValue("ListDataSourceWithConfigResponse.PageResult.DataSourceList["+ i +"].DevDataSourceInfo.CreateTime"));
			devDataSourceInfo.setModifyTime(_ctx.longValue("ListDataSourceWithConfigResponse.PageResult.DataSourceList["+ i +"].DevDataSourceInfo.ModifyTime"));
			devDataSourceInfo.setCreator(_ctx.stringValue("ListDataSourceWithConfigResponse.PageResult.DataSourceList["+ i +"].DevDataSourceInfo.Creator"));
			devDataSourceInfo.setCreatorName(_ctx.stringValue("ListDataSourceWithConfigResponse.PageResult.DataSourceList["+ i +"].DevDataSourceInfo.CreatorName"));
			devDataSourceInfo.setOwner(_ctx.stringValue("ListDataSourceWithConfigResponse.PageResult.DataSourceList["+ i +"].DevDataSourceInfo.Owner"));
			devDataSourceInfo.setOwnerName(_ctx.stringValue("ListDataSourceWithConfigResponse.PageResult.DataSourceList["+ i +"].DevDataSourceInfo.OwnerName"));
			devDataSourceInfo.setDescription(_ctx.stringValue("ListDataSourceWithConfigResponse.PageResult.DataSourceList["+ i +"].DevDataSourceInfo.Description"));
			devDataSourceInfo.setEnv(_ctx.stringValue("ListDataSourceWithConfigResponse.PageResult.DataSourceList["+ i +"].DevDataSourceInfo.Env"));

			List<ConfigItem2> configItemList1 = new ArrayList<ConfigItem2>();
			for (int j = 0; j < _ctx.lengthValue("ListDataSourceWithConfigResponse.PageResult.DataSourceList["+ i +"].DevDataSourceInfo.ConfigItemList.Length"); j++) {
				ConfigItem2 configItem2 = new ConfigItem2();
				configItem2.setKey(_ctx.stringValue("ListDataSourceWithConfigResponse.PageResult.DataSourceList["+ i +"].DevDataSourceInfo.ConfigItemList["+ j +"].Key"));
				configItem2.setValue(_ctx.stringValue("ListDataSourceWithConfigResponse.PageResult.DataSourceList["+ i +"].DevDataSourceInfo.ConfigItemList["+ j +"].Value"));

				configItemList1.add(configItem2);
			}
			devDataSourceInfo.setConfigItemList1(configItemList1);
			devProdDataSource.setDevDataSourceInfo(devDataSourceInfo);

			dataSourceList.add(devProdDataSource);
		}
		pageResult.setDataSourceList(dataSourceList);
		listDataSourceWithConfigResponse.setPageResult(pageResult);
	 
	 	return listDataSourceWithConfigResponse;
	}
}