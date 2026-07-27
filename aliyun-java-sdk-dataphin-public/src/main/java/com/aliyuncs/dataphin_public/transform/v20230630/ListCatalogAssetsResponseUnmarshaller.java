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
		listCatalogAssetsResponse.setMessage(_ctx.stringValue("ListCatalogAssetsResponse.Message"));
		listCatalogAssetsResponse.setHttpStatusCode(_ctx.integerValue("ListCatalogAssetsResponse.HttpStatusCode"));
		listCatalogAssetsResponse.setCode(_ctx.stringValue("ListCatalogAssetsResponse.Code"));
		listCatalogAssetsResponse.setSuccess(_ctx.booleanValue("ListCatalogAssetsResponse.Success"));

		Data data = new Data();
		data.setTotalCount(_ctx.longValue("ListCatalogAssetsResponse.Data.TotalCount"));

		List<Asset> assetList = new ArrayList<Asset>();
		for (int i = 0; i < _ctx.lengthValue("ListCatalogAssetsResponse.Data.AssetList.Length"); i++) {
			Asset asset = new Asset();
			asset.setSumTableName(_ctx.stringValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].SumTableName"));
			asset.setDatasourceId(_ctx.longValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].DatasourceId"));
			asset.setApiGroupName(_ctx.stringValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].ApiGroupName"));
			asset.setApiRequestMethod(_ctx.stringValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].ApiRequestMethod"));
			asset.setDataCellName(_ctx.stringValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].DataCellName"));
			asset.setProjectName(_ctx.stringValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].ProjectName"));
			asset.setSumTableGuid(_ctx.stringValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].SumTableGuid"));
			asset.setChartCount(_ctx.longValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].ChartCount"));
			asset.setAssetDescription(_ctx.stringValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].AssetDescription"));
			asset.setGuid(_ctx.stringValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].Guid"));
			asset.setAssetFrom(_ctx.stringValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].AssetFrom"));
			asset.setGranularity(_ctx.stringValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].Granularity"));
			asset.setDataCellId(_ctx.stringValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].DataCellId"));
			asset.setMaxSecurityLevel(_ctx.stringValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].MaxSecurityLevel"));
			asset.setBizUnitId(_ctx.longValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].BizUnitId"));
			asset.setBizUnitName(_ctx.stringValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].BizUnitName"));
			asset.setAssetFullName(_ctx.stringValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].AssetFullName"));
			asset.setIsDeleted(_ctx.booleanValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].IsDeleted"));
			asset.setSubType(_ctx.stringValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].SubType"));
			asset.setBiCatalog(_ctx.stringValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].BiCatalog"));
			asset.setProjectId(_ctx.longValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].ProjectId"));
			asset.setApiCallMode(_ctx.stringValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].ApiCallMode"));
			asset.setAssetName(_ctx.stringValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].AssetName"));
			asset.setAssetType(_ctx.stringValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].AssetType"));
			asset.setDataSourceName(_ctx.stringValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].DataSourceName"));
			asset.setAssetDisplayName(_ctx.stringValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].AssetDisplayName"));
			asset.setApiId(_ctx.longValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].ApiId"));

			List<String> assetTags = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].AssetTags.Length"); j++) {
				assetTags.add(_ctx.stringValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].AssetTags["+ j +"]"));
			}
			asset.setAssetTags(assetTags);

			List<Directorie> directories = new ArrayList<Directorie>();
			for (int j = 0; j < _ctx.lengthValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].Directories.Length"); j++) {
				Directorie directorie = new Directorie();
				directorie.setDirectoryId(_ctx.longValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].Directories["+ j +"].DirectoryId"));
				directorie.setTopicId(_ctx.longValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].Directories["+ j +"].TopicId"));
				directorie.setDirectoryName(_ctx.stringValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].Directories["+ j +"].DirectoryName"));
				directorie.setTopicName(_ctx.stringValue("ListCatalogAssetsResponse.Data.AssetList["+ i +"].Directories["+ j +"].TopicName"));

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