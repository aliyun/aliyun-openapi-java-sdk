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

import com.aliyuncs.dataphin_public.model.v20230630.ListDatasetsResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListDatasetsResponse.PageResult;
import com.aliyuncs.dataphin_public.model.v20230630.ListDatasetsResponse.PageResult.DatasetDTO;
import com.aliyuncs.dataphin_public.model.v20230630.ListDatasetsResponse.PageResult.DatasetDTO.DatasetVersionDTO;
import com.aliyuncs.dataphin_public.model.v20230630.ListDatasetsResponse.PageResult.DatasetDTO.DatasetVersionDTO.DataVersionConfig;
import com.aliyuncs.dataphin_public.model.v20230630.ListDatasetsResponse.PageResult.DatasetDTO.DatasetVersionDTO.DataVersionConfig.FileStorageConfig;
import com.aliyuncs.dataphin_public.model.v20230630.ListDatasetsResponse.PageResult.DatasetDTO.DatasetVersionDTO.DataVersionConfig.MetadataStorageConfig;
import com.aliyuncs.dataphin_public.model.v20230630.ListDatasetsResponse.PageResult.DatasetDTO.DatasetVersionDTO.DataVersionConfig.MetadataStorageConfig.TableSchema;
import com.aliyuncs.dataphin_public.model.v20230630.ListDatasetsResponse.PageResult.DatasetDTO.DatasetVersionDTO.DataVersionConfig.MetadataStorageConfig.TableSchema.ColumnSchemaDTO;
import com.aliyuncs.dataphin_public.model.v20230630.ListDatasetsResponse.PageResult.DatasetDTO.DatasetVersionDTO.DataVersionConfig.MetadataStorageConfig.TableSchema.ColumnSchemaDTO.VectorIndexConfig;
import com.aliyuncs.dataphin_public.model.v20230630.ListDatasetsResponse.PageResult.DatasetDTO.DatasetVersionDTO.DataVersionConfig.RealtimeMetaTableConfig;
import com.aliyuncs.dataphin_public.model.v20230630.ListDatasetsResponse.PageResult.DatasetDTO.DatasetVersionDTO.DataVersionConfig.RealtimeMetaTableConfig.TableSchema1;
import com.aliyuncs.dataphin_public.model.v20230630.ListDatasetsResponse.PageResult.DatasetDTO.DatasetVersionDTO.DataVersionConfig.RealtimeMetaTableConfig.TableSchema1.ColumnSchemaDTO3;
import com.aliyuncs.dataphin_public.model.v20230630.ListDatasetsResponse.PageResult.DatasetDTO.DatasetVersionDTO.DataVersionConfig.RealtimeMetaTableConfig.TableSchema1.ColumnSchemaDTO3.VectorIndexConfig4;
import com.aliyuncs.dataphin_public.model.v20230630.ListDatasetsResponse.PageResult.DatasetDTO.Owner;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDatasetsResponseUnmarshaller {

	public static ListDatasetsResponse unmarshall(ListDatasetsResponse listDatasetsResponse, UnmarshallerContext _ctx) {
		
		listDatasetsResponse.setRequestId(_ctx.stringValue("ListDatasetsResponse.RequestId"));
		listDatasetsResponse.setSuccess(_ctx.booleanValue("ListDatasetsResponse.Success"));
		listDatasetsResponse.setHttpStatusCode(_ctx.integerValue("ListDatasetsResponse.HttpStatusCode"));
		listDatasetsResponse.setCode(_ctx.stringValue("ListDatasetsResponse.Code"));
		listDatasetsResponse.setMessage(_ctx.stringValue("ListDatasetsResponse.Message"));

		PageResult pageResult = new PageResult();
		pageResult.setCount(_ctx.integerValue("ListDatasetsResponse.PageResult.Count"));

		List<DatasetDTO> resultData = new ArrayList<DatasetDTO>();
		for (int i = 0; i < _ctx.lengthValue("ListDatasetsResponse.PageResult.ResultData.Length"); i++) {
			DatasetDTO datasetDTO = new DatasetDTO();
			datasetDTO.setId(_ctx.longValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].Id"));
			datasetDTO.setProjectId(_ctx.longValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].ProjectId"));
			datasetDTO.setProjectName(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].ProjectName"));
			datasetDTO.setName(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].Name"));
			datasetDTO.setFileId(_ctx.longValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].FileId"));
			datasetDTO.setDirectory(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].Directory"));
			datasetDTO.setDataCellId(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].DataCellId"));
			datasetDTO.setDataCellName(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].DataCellName"));
			datasetDTO.setType(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].Type"));
			datasetDTO.setStorageType(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].StorageType"));
			datasetDTO.setMetadataStorageType(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].MetadataStorageType"));
			datasetDTO.setScenario(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].Scenario"));
			datasetDTO.setContentType(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].ContentType"));
			datasetDTO.setCreator(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].Creator"));
			datasetDTO.setCreatorName(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].CreatorName"));
			datasetDTO.setGmtCreate(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].GmtCreate"));
			datasetDTO.setGmtModified(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].GmtModified"));
			datasetDTO.setDescription(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].Description"));
			datasetDTO.setTenantId(_ctx.longValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].TenantId"));
			datasetDTO.setLockOwner(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].LockOwner"));
			datasetDTO.setLockOwnerName(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].LockOwnerName"));

			List<Owner> ownerList = new ArrayList<Owner>();
			for (int j = 0; j < _ctx.lengthValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].OwnerList.Length"); j++) {
				Owner owner = new Owner();
				owner.setUserId(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].OwnerList["+ j +"].UserId"));
				owner.setUserName(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].OwnerList["+ j +"].UserName"));

				ownerList.add(owner);
			}
			datasetDTO.setOwnerList(ownerList);

			List<DatasetVersionDTO> versionList = new ArrayList<DatasetVersionDTO>();
			for (int j = 0; j < _ctx.lengthValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList.Length"); j++) {
				DatasetVersionDTO datasetVersionDTO = new DatasetVersionDTO();
				datasetVersionDTO.setId(_ctx.longValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].Id"));
				datasetVersionDTO.setDatasetId(_ctx.longValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DatasetId"));
				datasetVersionDTO.setVersion(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].Version"));
				datasetVersionDTO.setCreator(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].Creator"));
				datasetVersionDTO.setGmtCreate(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].GmtCreate"));
				datasetVersionDTO.setGmtModified(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].GmtModified"));

				DataVersionConfig dataVersionConfig = new DataVersionConfig();
				dataVersionConfig.setVersionDescription(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.VersionDescription"));

				FileStorageConfig fileStorageConfig = new FileStorageConfig();
				fileStorageConfig.setDataSourceId(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.FileStorageConfig.DataSourceId"));
				fileStorageConfig.setDataSourceName(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.FileStorageConfig.DataSourceName"));
				fileStorageConfig.setDevPath(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.FileStorageConfig.DevPath"));
				fileStorageConfig.setProdPath(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.FileStorageConfig.ProdPath"));
				fileStorageConfig.setMountPath(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.FileStorageConfig.MountPath"));
				dataVersionConfig.setFileStorageConfig(fileStorageConfig);

				MetadataStorageConfig metadataStorageConfig = new MetadataStorageConfig();
				metadataStorageConfig.setMetadataStorageMode(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.MetadataStorageConfig.MetadataStorageMode"));
				metadataStorageConfig.setMetadataStorageType(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.MetadataStorageConfig.MetadataStorageType"));
				metadataStorageConfig.setDataSourceId(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.MetadataStorageConfig.DataSourceId"));
				metadataStorageConfig.setDataSourceName(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.MetadataStorageConfig.DataSourceName"));
				metadataStorageConfig.setDevSchema(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.MetadataStorageConfig.DevSchema"));
				metadataStorageConfig.setProdSchema(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.MetadataStorageConfig.ProdSchema"));
				metadataStorageConfig.setTableName(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.MetadataStorageConfig.TableName"));

				TableSchema tableSchema = new TableSchema();

				List<ColumnSchemaDTO> columns = new ArrayList<ColumnSchemaDTO>();
				for (int k = 0; k < _ctx.lengthValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.MetadataStorageConfig.TableSchema.Columns.Length"); k++) {
					ColumnSchemaDTO columnSchemaDTO = new ColumnSchemaDTO();
					columnSchemaDTO.setName(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.MetadataStorageConfig.TableSchema.Columns["+ k +"].Name"));
					columnSchemaDTO.setType(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.MetadataStorageConfig.TableSchema.Columns["+ k +"].Type"));
					columnSchemaDTO.setElementType(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.MetadataStorageConfig.TableSchema.Columns["+ k +"].ElementType"));
					columnSchemaDTO.setMaxCapacity(_ctx.integerValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.MetadataStorageConfig.TableSchema.Columns["+ k +"].MaxCapacity"));
					columnSchemaDTO.setPk(_ctx.booleanValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.MetadataStorageConfig.TableSchema.Columns["+ k +"].Pk"));
					columnSchemaDTO.setComment(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.MetadataStorageConfig.TableSchema.Columns["+ k +"].Comment"));
					columnSchemaDTO.setUrl(_ctx.booleanValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.MetadataStorageConfig.TableSchema.Columns["+ k +"].Url"));

					VectorIndexConfig vectorIndexConfig = new VectorIndexConfig();
					vectorIndexConfig.setEmbeddingModel(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.MetadataStorageConfig.TableSchema.Columns["+ k +"].VectorIndexConfig.EmbeddingModel"));
					vectorIndexConfig.setDimension(_ctx.longValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.MetadataStorageConfig.TableSchema.Columns["+ k +"].VectorIndexConfig.Dimension"));
					vectorIndexConfig.setIndexType(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.MetadataStorageConfig.TableSchema.Columns["+ k +"].VectorIndexConfig.IndexType"));
					vectorIndexConfig.setSimilarityType(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.MetadataStorageConfig.TableSchema.Columns["+ k +"].VectorIndexConfig.SimilarityType"));
					vectorIndexConfig.setIndexParams(_ctx.mapValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.MetadataStorageConfig.TableSchema.Columns["+ k +"].VectorIndexConfig.IndexParams"));
					columnSchemaDTO.setVectorIndexConfig(vectorIndexConfig);

					columns.add(columnSchemaDTO);
				}
				tableSchema.setColumns(columns);
				metadataStorageConfig.setTableSchema(tableSchema);
				dataVersionConfig.setMetadataStorageConfig(metadataStorageConfig);

				RealtimeMetaTableConfig realtimeMetaTableConfig = new RealtimeMetaTableConfig();
				realtimeMetaTableConfig.setProjectId(_ctx.longValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.RealtimeMetaTableConfig.ProjectId"));
				realtimeMetaTableConfig.setMetaTableName(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.RealtimeMetaTableConfig.MetaTableName"));
				realtimeMetaTableConfig.setDatasourceType(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.RealtimeMetaTableConfig.DatasourceType"));

				TableSchema1 tableSchema1 = new TableSchema1();

				List<ColumnSchemaDTO3> columns2 = new ArrayList<ColumnSchemaDTO3>();
				for (int k = 0; k < _ctx.lengthValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.RealtimeMetaTableConfig.TableSchema.Columns.Length"); k++) {
					ColumnSchemaDTO3 columnSchemaDTO3 = new ColumnSchemaDTO3();
					columnSchemaDTO3.setName(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.RealtimeMetaTableConfig.TableSchema.Columns["+ k +"].Name"));
					columnSchemaDTO3.setType(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.RealtimeMetaTableConfig.TableSchema.Columns["+ k +"].Type"));
					columnSchemaDTO3.setElementType(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.RealtimeMetaTableConfig.TableSchema.Columns["+ k +"].ElementType"));
					columnSchemaDTO3.setMaxCapacity(_ctx.integerValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.RealtimeMetaTableConfig.TableSchema.Columns["+ k +"].MaxCapacity"));
					columnSchemaDTO3.setPk(_ctx.booleanValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.RealtimeMetaTableConfig.TableSchema.Columns["+ k +"].Pk"));
					columnSchemaDTO3.setComment(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.RealtimeMetaTableConfig.TableSchema.Columns["+ k +"].Comment"));
					columnSchemaDTO3.setUrl(_ctx.booleanValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.RealtimeMetaTableConfig.TableSchema.Columns["+ k +"].Url"));

					VectorIndexConfig4 vectorIndexConfig4 = new VectorIndexConfig4();
					vectorIndexConfig4.setEmbeddingModel(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.RealtimeMetaTableConfig.TableSchema.Columns["+ k +"].VectorIndexConfig.EmbeddingModel"));
					vectorIndexConfig4.setDimension(_ctx.longValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.RealtimeMetaTableConfig.TableSchema.Columns["+ k +"].VectorIndexConfig.Dimension"));
					vectorIndexConfig4.setIndexType(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.RealtimeMetaTableConfig.TableSchema.Columns["+ k +"].VectorIndexConfig.IndexType"));
					vectorIndexConfig4.setSimilarityType(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.RealtimeMetaTableConfig.TableSchema.Columns["+ k +"].VectorIndexConfig.SimilarityType"));
					vectorIndexConfig4.setIndexParams(_ctx.mapValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.RealtimeMetaTableConfig.TableSchema.Columns["+ k +"].VectorIndexConfig.IndexParams"));
					columnSchemaDTO3.setVectorIndexConfig4(vectorIndexConfig4);

					columns2.add(columnSchemaDTO3);
				}
				tableSchema1.setColumns2(columns2);
				realtimeMetaTableConfig.setTableSchema1(tableSchema1);
				dataVersionConfig.setRealtimeMetaTableConfig(realtimeMetaTableConfig);
				datasetVersionDTO.setDataVersionConfig(dataVersionConfig);

				versionList.add(datasetVersionDTO);
			}
			datasetDTO.setVersionList(versionList);

			resultData.add(datasetDTO);
		}
		pageResult.setResultData(resultData);
		listDatasetsResponse.setPageResult(pageResult);
	 
	 	return listDatasetsResponse;
	}
}