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

import com.aliyuncs.dataphin_public.model.v20230630.ListCatalogAssetsResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListCatalogAssetsResponse.Data;
import com.aliyuncs.dataphin_public.model.v20230630.ListCatalogAssetsResponse.Data.Asset;
import com.aliyuncs.dataphin_public.model.v20230630.ListCatalogAssetsResponse.Data.Asset.Directorie;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCatalogAssetsResponseUnmarshaller {

	public static ListCatalogAssetsResponse unmarshall(ListCatalogAssetsResponse listCatalogAssetsResponse, UnmarshallerContext _ctx) {
		
		listCatalogAssetsResponse.setRequestId(_ctx.stringValue("ListCatalogAssetsResponse.RequestId"));
		listCatalogAssetsResponse.setSuccess(_ctx.booleanValue("ListCatalogAssetsResponse.Success"));
		listCatalogAssetsResponse.setHttpStatusCode(_ctx.integerValue("ListCatalogAssetsResponse.HttpStatusCode"));
		listCatalogAssetsResponse.setCode(_ctx.stringValue("ListCatalogAssetsResponse.Code"));
		listCatalogAssetsResponse.setMessage(_ctx.stringValue("ListCatalogAssetsResponse.Message"));

		Data data = new Data();
		data.setTotalCount(_ctx.longValue("ListCatalogAssetsResponse.Data.TotalCount"));

		List<Asset> assetList = new ArrayList<Asset>();
		for (int i = 0; i < _ctx.lengthValue("ListCatalogAssetsResponse.Data.AssetList.Length"); i++) {
			Asset asset = new Asset();
			asset.setGuid(_ctx.stringValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].Guid"));
			asset.setAssetType(_ctx.stringValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].AssetType"));
			asset.setIsDeleted(_ctx.booleanValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].IsDeleted"));
			asset.setAssetName(_ctx.stringValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].AssetName"));
			asset.setAssetDisplayName(_ctx.stringValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].AssetDisplayName"));
			asset.setAssetFullName(_ctx.stringValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].AssetFullName"));
			asset.setMaxSecurityLevel(_ctx.stringValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].MaxSecurityLevel"));
			asset.setAssetDescription(_ctx.stringValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].AssetDescription"));
			asset.setAssetFrom(_ctx.stringValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].AssetFrom"));
			asset.setBizUnitId(_ctx.longValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].BizUnitId"));
			asset.setBizUnitName(_ctx.stringValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].BizUnitName"));
			asset.setProjectId(_ctx.longValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].ProjectId"));
			asset.setProjectName(_ctx.stringValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].ProjectName"));
			asset.setDatasourceId(_ctx.longValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].DatasourceId"));
			asset.setDataSourceName(_ctx.stringValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].DataSourceName"));
			asset.setSubType(_ctx.stringValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].SubType"));
			asset.setSumTableGuid(_ctx.stringValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].SumTableGuid"));
			asset.setSumTableName(_ctx.stringValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].SumTableName"));
			asset.setGranularity(_ctx.stringValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].Granularity"));
			asset.setDataCellId(_ctx.stringValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].DataCellId"));
			asset.setDataCellName(_ctx.stringValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].DataCellName"));
			asset.setApiId(_ctx.longValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].ApiId"));
			asset.setApiGroupName(_ctx.stringValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].ApiGroupName"));
			asset.setApiRequestMethod(_ctx.stringValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].ApiRequestMethod"));
			asset.setApiCallMode(_ctx.stringValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].ApiCallMode"));
			asset.setBiCatalog(_ctx.stringValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].BiCatalog"));
			asset.setChartCount(_ctx.longValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].ChartCount"));

			List<String> assetTags = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].AssetTags.Length"); j++) {
				assetTags.add(_ctx.stringValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].AssetTags["+ j +"]"));
			}
			asset.setAssetTags(assetTags);

			List<Directorie> directories = new ArrayList<Directorie>();
			for (int j = 0; j < _ctx.lengthValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].Directories.Length"); j++) {
				Directorie directorie = new Directorie();
				directorie.setTopicId(_ctx.longValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].Directories["+ j +"].TopicId"));
				directorie.setTopicName(_ctx.stringValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].Directories["+ j +"].TopicName"));
				directorie.setDirectoryId(_ctx.longValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].Directories["+ j +"].DirectoryId"));
				directorie.setDirectoryName(_ctx.stringValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].Directories["+ j +"].DirectoryName"));

				directories.add(directorie);
			}
			asset.setDirectories(directories);

			assetList.add(asset);
		}
		data.setAssetList(assetList);
		listCatalogAssetsResponse.setData(data);
	 
	 	return listCatalogAssetsResponse;
	}
}