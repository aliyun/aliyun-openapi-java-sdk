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

import com.aliyuncs.dataphin_public.model.v20230630.GetDatasetResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetDatasetResponse.DatasetDTO;
import com.aliyuncs.dataphin_public.model.v20230630.GetDatasetResponse.DatasetDTO.DatasetVersionDTO;
import com.aliyuncs.dataphin_public.model.v20230630.GetDatasetResponse.DatasetDTO.DatasetVersionDTO.DataVersionConfig;
import com.aliyuncs.dataphin_public.model.v20230630.GetDatasetResponse.DatasetDTO.DatasetVersionDTO.DataVersionConfig.FileStorageConfig;
import com.aliyuncs.dataphin_public.model.v20230630.GetDatasetResponse.DatasetDTO.DatasetVersionDTO.DataVersionConfig.MetadataStorageConfig;
import com.aliyuncs.dataphin_public.model.v20230630.GetDatasetResponse.DatasetDTO.DatasetVersionDTO.DataVersionConfig.MetadataStorageConfig.TableSchema;
import com.aliyuncs.dataphin_public.model.v20230630.GetDatasetResponse.DatasetDTO.DatasetVersionDTO.DataVersionConfig.MetadataStorageConfig.TableSchema.ColumnSchemaDTO;
import com.aliyuncs.dataphin_public.model.v20230630.GetDatasetResponse.DatasetDTO.DatasetVersionDTO.DataVersionConfig.MetadataStorageConfig.TableSchema.ColumnSchemaDTO.VectorIndexConfig;
import com.aliyuncs.dataphin_public.model.v20230630.GetDatasetResponse.DatasetDTO.DatasetVersionDTO.DataVersionConfig.RealtimeMetaTableConfig;
import com.aliyuncs.dataphin_public.model.v20230630.GetDatasetResponse.DatasetDTO.DatasetVersionDTO.DataVersionConfig.RealtimeMetaTableConfig.TableSchema1;
import com.aliyuncs.dataphin_public.model.v20230630.GetDatasetResponse.DatasetDTO.DatasetVersionDTO.DataVersionConfig.RealtimeMetaTableConfig.TableSchema1.ColumnSchemaDTO3;
import com.aliyuncs.dataphin_public.model.v20230630.GetDatasetResponse.DatasetDTO.DatasetVersionDTO.DataVersionConfig.RealtimeMetaTableConfig.TableSchema1.ColumnSchemaDTO3.VectorIndexConfig4;
import com.aliyuncs.dataphin_public.model.v20230630.GetDatasetResponse.DatasetDTO.Owner;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDatasetResponseUnmarshaller {

	public static GetDatasetResponse unmarshall(GetDatasetResponse getDatasetResponse, UnmarshallerContext _ctx) {
		
		getDatasetResponse.setRequestId(_ctx.stringValue("GetDatasetResponse.RequestId"));
		getDatasetResponse.setSuccess(_ctx.booleanValue("GetDatasetResponse.Success"));
		getDatasetResponse.setHttpStatusCode(_ctx.integerValue("GetDatasetResponse.HttpStatusCode"));
		getDatasetResponse.setCode(_ctx.stringValue("GetDatasetResponse.Code"));
		getDatasetResponse.setMessage(_ctx.stringValue("GetDatasetResponse.Message"));

		DatasetDTO datasetDTO = new DatasetDTO();
		datasetDTO.setId(_ctx.longValue("GetDatasetResponse.DatasetDTO.Id"));
		datasetDTO.setProjectId(_ctx.longValue("GetDatasetResponse.DatasetDTO.ProjectId"));
		datasetDTO.setProjectName(_ctx.stringValue("GetDatasetResponse.DatasetDTO.ProjectName"));
		datasetDTO.setName(_ctx.stringValue("GetDatasetResponse.DatasetDTO.Name"));
		datasetDTO.setFileId(_ctx.longValue("GetDatasetResponse.DatasetDTO.FileId"));
		datasetDTO.setDirectory(_ctx.stringValue("GetDatasetResponse.DatasetDTO.Directory"));
		datasetDTO.setDataCellId(_ctx.stringValue("GetDatasetResponse.DatasetDTO.DataCellId"));
		datasetDTO.setDataCellName(_ctx.stringValue("GetDatasetResponse.DatasetDTO.DataCellName"));
		datasetDTO.setType(_ctx.stringValue("GetDatasetResponse.DatasetDTO.Type"));
		datasetDTO.setStorageType(_ctx.stringValue("GetDatasetResponse.DatasetDTO.StorageType"));
		datasetDTO.setMetadataStorageType(_ctx.stringValue("GetDatasetResponse.DatasetDTO.MetadataStorageType"));
		datasetDTO.setScenario(_ctx.stringValue("GetDatasetResponse.DatasetDTO.Scenario"));
		datasetDTO.setContentType(_ctx.stringValue("GetDatasetResponse.DatasetDTO.ContentType"));
		datasetDTO.setCreator(_ctx.stringValue("GetDatasetResponse.DatasetDTO.Creator"));
		datasetDTO.setCreatorName(_ctx.stringValue("GetDatasetResponse.DatasetDTO.CreatorName"));
		datasetDTO.setGmtCreate(_ctx.stringValue("GetDatasetResponse.DatasetDTO.GmtCreate"));
		datasetDTO.setGmtModified(_ctx.stringValue("GetDatasetResponse.DatasetDTO.GmtModified"));
		datasetDTO.setDescription(_ctx.stringValue("GetDatasetResponse.DatasetDTO.Description"));
		datasetDTO.setTenantId(_ctx.longValue("GetDatasetResponse.DatasetDTO.TenantId"));
		datasetDTO.setLockOwner(_ctx.stringValue("GetDatasetResponse.DatasetDTO.LockOwner"));
		datasetDTO.setLockOwnerName(_ctx.stringValue("GetDatasetResponse.DatasetDTO.LockOwnerName"));

		List<Owner> ownerList = new ArrayList<Owner>();
		for (int i = 0; i < _ctx.lengthValue("GetDatasetResponse.DatasetDTO.OwnerList.Length"); i++) {
			Owner owner = new Owner();
			owner.setUserId(_ctx.stringValue("GetDatasetResponse.DatasetDTO.OwnerList["+ i +"].UserId"));
			owner.setUserName(_ctx.stringValue("GetDatasetResponse.DatasetDTO.OwnerList["+ i +"].UserName"));

			ownerList.add(owner);
		}
		datasetDTO.setOwnerList(ownerList);

		List<DatasetVersionDTO> versionList = new ArrayList<DatasetVersionDTO>();
		for (int i = 0; i < _ctx.lengthValue("GetDatasetResponse.DatasetDTO.VersionList.Length"); i++) {
			DatasetVersionDTO datasetVersionDTO = new DatasetVersionDTO();
			datasetVersionDTO.setId(_ctx.longValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].Id"));
			datasetVersionDTO.setDatasetId(_ctx.longValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DatasetId"));
			datasetVersionDTO.setVersion(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].Version"));
			datasetVersionDTO.setCreator(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].Creator"));
			datasetVersionDTO.setGmtCreate(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].GmtCreate"));
			datasetVersionDTO.setGmtModified(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].GmtModified"));

			DataVersionConfig dataVersionConfig = new DataVersionConfig();
			dataVersionConfig.setVersionDescription(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.VersionDescription"));

			FileStorageConfig fileStorageConfig = new FileStorageConfig();
			fileStorageConfig.setDataSourceId(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.FileStorageConfig.DataSourceId"));
			fileStorageConfig.setDataSourceName(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.FileStorageConfig.DataSourceName"));
			fileStorageConfig.setDevPath(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.FileStorageConfig.DevPath"));
			fileStorageConfig.setProdPath(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.FileStorageConfig.ProdPath"));
			fileStorageConfig.setMountPath(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.FileStorageConfig.MountPath"));
			dataVersionConfig.setFileStorageConfig(fileStorageConfig);

			MetadataStorageConfig metadataStorageConfig = new MetadataStorageConfig();
			metadataStorageConfig.setMetadataStorageMode(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.MetadataStorageConfig.MetadataStorageMode"));
			metadataStorageConfig.setMetadataStorageType(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.MetadataStorageConfig.MetadataStorageType"));
			metadataStorageConfig.setDataSourceId(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.MetadataStorageConfig.DataSourceId"));
			metadataStorageConfig.setDataSourceName(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.MetadataStorageConfig.DataSourceName"));
			metadataStorageConfig.setDevSchema(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.MetadataStorageConfig.DevSchema"));
			metadataStorageConfig.setProdSchema(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.MetadataStorageConfig.ProdSchema"));
			metadataStorageConfig.setTableName(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.MetadataStorageConfig.TableName"));

			TableSchema tableSchema = new TableSchema();

			List<ColumnSchemaDTO> columns = new ArrayList<ColumnSchemaDTO>();
			for (int j = 0; j < _ctx.lengthValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.MetadataStorageConfig.TableSchema.Columns.Length"); j++) {
				ColumnSchemaDTO columnSchemaDTO = new ColumnSchemaDTO();
				columnSchemaDTO.setName(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.MetadataStorageConfig.TableSchema.Columns["+ j +"].Name"));
				columnSchemaDTO.setType(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.MetadataStorageConfig.TableSchema.Columns["+ j +"].Type"));
				columnSchemaDTO.setElementType(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.MetadataStorageConfig.TableSchema.Columns["+ j +"].ElementType"));
				columnSchemaDTO.setMaxCapacity(_ctx.integerValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.MetadataStorageConfig.TableSchema.Columns["+ j +"].MaxCapacity"));
				columnSchemaDTO.setPk(_ctx.booleanValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.MetadataStorageConfig.TableSchema.Columns["+ j +"].Pk"));
				columnSchemaDTO.setComment(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.MetadataStorageConfig.TableSchema.Columns["+ j +"].Comment"));
				columnSchemaDTO.setUrl(_ctx.booleanValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.MetadataStorageConfig.TableSchema.Columns["+ j +"].Url"));

				VectorIndexConfig vectorIndexConfig = new VectorIndexConfig();
				vectorIndexConfig.setEmbeddingModel(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.MetadataStorageConfig.TableSchema.Columns["+ j +"].VectorIndexConfig.EmbeddingModel"));
				vectorIndexConfig.setDimension(_ctx.longValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.MetadataStorageConfig.TableSchema.Columns["+ j +"].VectorIndexConfig.Dimension"));
				vectorIndexConfig.setIndexType(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.MetadataStorageConfig.TableSchema.Columns["+ j +"].VectorIndexConfig.IndexType"));
				vectorIndexConfig.setSimilarityType(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.MetadataStorageConfig.TableSchema.Columns["+ j +"].VectorIndexConfig.SimilarityType"));
				vectorIndexConfig.setIndexParams(_ctx.mapValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.MetadataStorageConfig.TableSchema.Columns["+ j +"].VectorIndexConfig.IndexParams"));
				columnSchemaDTO.setVectorIndexConfig(vectorIndexConfig);

				columns.add(columnSchemaDTO);
			}
			tableSchema.setColumns(columns);
			metadataStorageConfig.setTableSchema(tableSchema);
			dataVersionConfig.setMetadataStorageConfig(metadataStorageConfig);

			RealtimeMetaTableConfig realtimeMetaTableConfig = new RealtimeMetaTableConfig();
			realtimeMetaTableConfig.setProjectId(_ctx.longValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.RealtimeMetaTableConfig.ProjectId"));
			realtimeMetaTableConfig.setMetaTableName(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.RealtimeMetaTableConfig.MetaTableName"));
			realtimeMetaTableConfig.setDatasourceType(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.RealtimeMetaTableConfig.DatasourceType"));

			TableSchema1 tableSchema1 = new TableSchema1();

			List<ColumnSchemaDTO3> columns2 = new ArrayList<ColumnSchemaDTO3>();
			for (int j = 0; j < _ctx.lengthValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.RealtimeMetaTableConfig.TableSchema.Columns.Length"); j++) {
				ColumnSchemaDTO3 columnSchemaDTO3 = new ColumnSchemaDTO3();
				columnSchemaDTO3.setName(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.RealtimeMetaTableConfig.TableSchema.Columns["+ j +"].Name"));
				columnSchemaDTO3.setType(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.RealtimeMetaTableConfig.TableSchema.Columns["+ j +"].Type"));
				columnSchemaDTO3.setElementType(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.RealtimeMetaTableConfig.TableSchema.Columns["+ j +"].ElementType"));
				columnSchemaDTO3.setMaxCapacity(_ctx.integerValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.RealtimeMetaTableConfig.TableSchema.Columns["+ j +"].MaxCapacity"));
				columnSchemaDTO3.setPk(_ctx.booleanValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.RealtimeMetaTableConfig.TableSchema.Columns["+ j +"].Pk"));
				columnSchemaDTO3.setComment(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.RealtimeMetaTableConfig.TableSchema.Columns["+ j +"].Comment"));
				columnSchemaDTO3.setUrl(_ctx.booleanValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.RealtimeMetaTableConfig.TableSchema.Columns["+ j +"].Url"));

				VectorIndexConfig4 vectorIndexConfig4 = new VectorIndexConfig4();
				vectorIndexConfig4.setEmbeddingModel(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.RealtimeMetaTableConfig.TableSchema.Columns["+ j +"].VectorIndexConfig.EmbeddingModel"));
				vectorIndexConfig4.setDimension(_ctx.longValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.RealtimeMetaTableConfig.TableSchema.Columns["+ j +"].VectorIndexConfig.Dimension"));
				vectorIndexConfig4.setIndexType(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.RealtimeMetaTableConfig.TableSchema.Columns["+ j +"].VectorIndexConfig.IndexType"));
				vectorIndexConfig4.setSimilarityType(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.RealtimeMetaTableConfig.TableSchema.Columns["+ j +"].VectorIndexConfig.SimilarityType"));
				vectorIndexConfig4.setIndexParams(_ctx.mapValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.RealtimeMetaTableConfig.TableSchema.Columns["+ j +"].VectorIndexConfig.IndexParams"));
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
		getDatasetResponse.setDatasetDTO(datasetDTO);
	 
	 	return getDatasetResponse;
	}
}