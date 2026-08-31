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
import com.aliyuncs.dataphin_public.model.v20230630.GetDatasetResponse.DatasetDTO.DatasetVersionDTO.ApiInfo;
import com.aliyuncs.dataphin_public.model.v20230630.GetDatasetResponse.DatasetDTO.DatasetVersionDTO.ApiInfo.ApiRequestParamDTO;
import com.aliyuncs.dataphin_public.model.v20230630.GetDatasetResponse.DatasetDTO.DatasetVersionDTO.ApiInfo.ApiResponseParamDTO;
import com.aliyuncs.dataphin_public.model.v20230630.GetDatasetResponse.DatasetDTO.DatasetVersionDTO.DataVersionConfig;
import com.aliyuncs.dataphin_public.model.v20230630.GetDatasetResponse.DatasetDTO.DatasetVersionDTO.DataVersionConfig.FileStorageConfig;
import com.aliyuncs.dataphin_public.model.v20230630.GetDatasetResponse.DatasetDTO.DatasetVersionDTO.DataVersionConfig.MetadataStorageConfig;
import com.aliyuncs.dataphin_public.model.v20230630.GetDatasetResponse.DatasetDTO.DatasetVersionDTO.DataVersionConfig.MetadataStorageConfig.TableSchema1;
import com.aliyuncs.dataphin_public.model.v20230630.GetDatasetResponse.DatasetDTO.DatasetVersionDTO.DataVersionConfig.MetadataStorageConfig.TableSchema1.ColumnSchemaDTO3;
import com.aliyuncs.dataphin_public.model.v20230630.GetDatasetResponse.DatasetDTO.DatasetVersionDTO.DataVersionConfig.MetadataStorageConfig.TableSchema1.ColumnSchemaDTO3.VectorIndexConfig4;
import com.aliyuncs.dataphin_public.model.v20230630.GetDatasetResponse.DatasetDTO.DatasetVersionDTO.DataVersionConfig.RealtimeMetaTableConfig;
import com.aliyuncs.dataphin_public.model.v20230630.GetDatasetResponse.DatasetDTO.DatasetVersionDTO.DataVersionConfig.RealtimeMetaTableConfig.TableSchema;
import com.aliyuncs.dataphin_public.model.v20230630.GetDatasetResponse.DatasetDTO.DatasetVersionDTO.DataVersionConfig.RealtimeMetaTableConfig.TableSchema.ColumnSchemaDTO;
import com.aliyuncs.dataphin_public.model.v20230630.GetDatasetResponse.DatasetDTO.DatasetVersionDTO.DataVersionConfig.RealtimeMetaTableConfig.TableSchema.ColumnSchemaDTO.VectorIndexConfig;
import com.aliyuncs.dataphin_public.model.v20230630.GetDatasetResponse.DatasetDTO.Owner;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDatasetResponseUnmarshaller {

	public static GetDatasetResponse unmarshall(GetDatasetResponse getDatasetResponse, UnmarshallerContext _ctx) {
		
		getDatasetResponse.setRequestId(_ctx.stringValue("GetDatasetResponse.RequestId"));
		getDatasetResponse.setMessage(_ctx.stringValue("GetDatasetResponse.Message"));
		getDatasetResponse.setHttpStatusCode(_ctx.integerValue("GetDatasetResponse.HttpStatusCode"));
		getDatasetResponse.setCode(_ctx.stringValue("GetDatasetResponse.Code"));
		getDatasetResponse.setSuccess(_ctx.booleanValue("GetDatasetResponse.Success"));

		DatasetDTO datasetDTO = new DatasetDTO();
		datasetDTO.setStorageType(_ctx.stringValue("GetDatasetResponse.DatasetDTO.StorageType"));
		datasetDTO.setDescription(_ctx.stringValue("GetDatasetResponse.DatasetDTO.Description"));
		datasetDTO.setDataCellName(_ctx.stringValue("GetDatasetResponse.DatasetDTO.DataCellName"));
		datasetDTO.setContentType(_ctx.stringValue("GetDatasetResponse.DatasetDTO.ContentType"));
		datasetDTO.setProjectName(_ctx.stringValue("GetDatasetResponse.DatasetDTO.ProjectName"));
		datasetDTO.setProjectId(_ctx.longValue("GetDatasetResponse.DatasetDTO.ProjectId"));
		datasetDTO.setGmtModified(_ctx.stringValue("GetDatasetResponse.DatasetDTO.GmtModified"));
		datasetDTO.setMetadataStorageType(_ctx.stringValue("GetDatasetResponse.DatasetDTO.MetadataStorageType"));
		datasetDTO.setCreator(_ctx.stringValue("GetDatasetResponse.DatasetDTO.Creator"));
		datasetDTO.setLockOwner(_ctx.stringValue("GetDatasetResponse.DatasetDTO.LockOwner"));
		datasetDTO.setDataCellId(_ctx.stringValue("GetDatasetResponse.DatasetDTO.DataCellId"));
		datasetDTO.setName(_ctx.stringValue("GetDatasetResponse.DatasetDTO.Name"));
		datasetDTO.setScenario(_ctx.stringValue("GetDatasetResponse.DatasetDTO.Scenario"));
		datasetDTO.setType(_ctx.stringValue("GetDatasetResponse.DatasetDTO.Type"));
		datasetDTO.setGmtCreate(_ctx.stringValue("GetDatasetResponse.DatasetDTO.GmtCreate"));
		datasetDTO.setTenantId(_ctx.longValue("GetDatasetResponse.DatasetDTO.TenantId"));
		datasetDTO.setFileId(_ctx.longValue("GetDatasetResponse.DatasetDTO.FileId"));
		datasetDTO.setId(_ctx.longValue("GetDatasetResponse.DatasetDTO.Id"));
		datasetDTO.setCreatorName(_ctx.stringValue("GetDatasetResponse.DatasetDTO.CreatorName"));
		datasetDTO.setDirectory(_ctx.stringValue("GetDatasetResponse.DatasetDTO.Directory"));
		datasetDTO.setLockOwnerName(_ctx.stringValue("GetDatasetResponse.DatasetDTO.LockOwnerName"));

		List<Owner> ownerList = new ArrayList<Owner>();
		for (int i = 0; i < _ctx.lengthValue("GetDatasetResponse.DatasetDTO.OwnerList.Length"); i++) {
			Owner owner = new Owner();
			owner.setUserName(_ctx.stringValue("GetDatasetResponse.DatasetDTO.OwnerList["+ i +"].UserName"));
			owner.setUserId(_ctx.stringValue("GetDatasetResponse.DatasetDTO.OwnerList["+ i +"].UserId"));

			ownerList.add(owner);
		}
		datasetDTO.setOwnerList(ownerList);

		List<DatasetVersionDTO> versionList = new ArrayList<DatasetVersionDTO>();
		for (int i = 0; i < _ctx.lengthValue("GetDatasetResponse.DatasetDTO.VersionList.Length"); i++) {
			DatasetVersionDTO datasetVersionDTO = new DatasetVersionDTO();
			datasetVersionDTO.setGmtCreate(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].GmtCreate"));
			datasetVersionDTO.setVersion(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].Version"));
			datasetVersionDTO.setGmtModified(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].GmtModified"));
			datasetVersionDTO.setId(_ctx.longValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].Id"));
			datasetVersionDTO.setCreator(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].Creator"));
			datasetVersionDTO.setDatasetId(_ctx.longValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DatasetId"));

			ApiInfo apiInfo = new ApiInfo();
			apiInfo.setOsApiGroup(_ctx.integerValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].ApiInfo.OsApiGroup"));
			apiInfo.setApiNo(_ctx.longValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].ApiInfo.ApiNo"));
			apiInfo.setOsApiGroupName(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].ApiInfo.OsApiGroupName"));
			apiInfo.setRequestMethod(_ctx.integerValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].ApiInfo.RequestMethod"));
			apiInfo.setTimeout(_ctx.integerValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].ApiInfo.Timeout"));
			apiInfo.setOsProject(_ctx.integerValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].ApiInfo.OsProject"));
			apiInfo.setBizProtocol(_ctx.integerValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].ApiInfo.Protocol"));
			apiInfo.setExecuteMode(_ctx.integerValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].ApiInfo.ExecuteMode"));
			apiInfo.setExecTimeout(_ctx.integerValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].ApiInfo.ExecTimeout"));
			apiInfo.setOsProjectName(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].ApiInfo.OsProjectName"));

			List<ApiResponseParamDTO> responseParamList = new ArrayList<ApiResponseParamDTO>();
			for (int j = 0; j < _ctx.lengthValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].ApiInfo.ResponseParamList.Length"); j++) {
				ApiResponseParamDTO apiResponseParamDTO = new ApiResponseParamDTO();
				apiResponseParamDTO.setSeqNum(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].ApiInfo.ResponseParamList["+ j +"].SeqNum"));
				apiResponseParamDTO.setMappingColumn(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].ApiInfo.ResponseParamList["+ j +"].MappingColumn"));
				apiResponseParamDTO.setSample(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].ApiInfo.ResponseParamList["+ j +"].Sample"));
				apiResponseParamDTO.setDateFormat(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].ApiInfo.ResponseParamList["+ j +"].DateFormat"));
				apiResponseParamDTO.setDescr(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].ApiInfo.ResponseParamList["+ j +"].Descr"));
				apiResponseParamDTO.setParamName(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].ApiInfo.ResponseParamList["+ j +"].ParamName"));
				apiResponseParamDTO.setParamType(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].ApiInfo.ResponseParamList["+ j +"].ParamType"));
				apiResponseParamDTO.setIsUrl(_ctx.booleanValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].ApiInfo.ResponseParamList["+ j +"].IsUrl"));
				apiResponseParamDTO.setOriginalColumn(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].ApiInfo.ResponseParamList["+ j +"].OriginalColumn"));

				responseParamList.add(apiResponseParamDTO);
			}
			apiInfo.setResponseParamList(responseParamList);

			List<ApiRequestParamDTO> requestParamList = new ArrayList<ApiRequestParamDTO>();
			for (int j = 0; j < _ctx.lengthValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].ApiInfo.RequestParamList.Length"); j++) {
				ApiRequestParamDTO apiRequestParamDTO = new ApiRequestParamDTO();
				apiRequestParamDTO.setOperator(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].ApiInfo.RequestParamList["+ j +"].Operator"));
				apiRequestParamDTO.setSeqNum(_ctx.integerValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].ApiInfo.RequestParamList["+ j +"].SeqNum"));
				apiRequestParamDTO.setOptional(_ctx.booleanValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].ApiInfo.RequestParamList["+ j +"].Optional"));
				apiRequestParamDTO.setMappingColumn(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].ApiInfo.RequestParamList["+ j +"].MappingColumn"));
				apiRequestParamDTO.setSample(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].ApiInfo.RequestParamList["+ j +"].Sample"));
				apiRequestParamDTO.setDescr(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].ApiInfo.RequestParamList["+ j +"].Descr"));
				apiRequestParamDTO.setMust(_ctx.booleanValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].ApiInfo.RequestParamList["+ j +"].Must"));
				apiRequestParamDTO.setParamType(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].ApiInfo.RequestParamList["+ j +"].ParamType"));
				apiRequestParamDTO.setOriginalColumn(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].ApiInfo.RequestParamList["+ j +"].OriginalColumn"));
				apiRequestParamDTO.setDefaultValue(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].ApiInfo.RequestParamList["+ j +"].DefaultValue"));
				apiRequestParamDTO.setDateFormat(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].ApiInfo.RequestParamList["+ j +"].DateFormat"));
				apiRequestParamDTO.setParamName(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].ApiInfo.RequestParamList["+ j +"].ParamName"));
				apiRequestParamDTO.setIsUrl(_ctx.booleanValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].ApiInfo.RequestParamList["+ j +"].IsUrl"));

				requestParamList.add(apiRequestParamDTO);
			}
			apiInfo.setRequestParamList(requestParamList);
			datasetVersionDTO.setApiInfo(apiInfo);

			DataVersionConfig dataVersionConfig = new DataVersionConfig();
			dataVersionConfig.setVersionDescription(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.VersionDescription"));

			FileStorageConfig fileStorageConfig = new FileStorageConfig();
			fileStorageConfig.setMountPath(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.FileStorageConfig.MountPath"));
			fileStorageConfig.setDataSourceName(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.FileStorageConfig.DataSourceName"));
			fileStorageConfig.setProdPath(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.FileStorageConfig.ProdPath"));
			fileStorageConfig.setDataSourceId(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.FileStorageConfig.DataSourceId"));
			fileStorageConfig.setDevPath(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.FileStorageConfig.DevPath"));
			dataVersionConfig.setFileStorageConfig(fileStorageConfig);

			RealtimeMetaTableConfig realtimeMetaTableConfig = new RealtimeMetaTableConfig();
			realtimeMetaTableConfig.setProjectId(_ctx.longValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.RealtimeMetaTableConfig.ProjectId"));
			realtimeMetaTableConfig.setMetaTableName(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.RealtimeMetaTableConfig.MetaTableName"));
			realtimeMetaTableConfig.setDatasourceType(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.RealtimeMetaTableConfig.DatasourceType"));

			TableSchema tableSchema = new TableSchema();

			List<ColumnSchemaDTO> columns = new ArrayList<ColumnSchemaDTO>();
			for (int j = 0; j < _ctx.lengthValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.RealtimeMetaTableConfig.TableSchema.Columns.Length"); j++) {
				ColumnSchemaDTO columnSchemaDTO = new ColumnSchemaDTO();
				columnSchemaDTO.setComment(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.RealtimeMetaTableConfig.TableSchema.Columns["+ j +"].Comment"));
				columnSchemaDTO.setType(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.RealtimeMetaTableConfig.TableSchema.Columns["+ j +"].Type"));
				columnSchemaDTO.setElementType(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.RealtimeMetaTableConfig.TableSchema.Columns["+ j +"].ElementType"));
				columnSchemaDTO.setPk(_ctx.booleanValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.RealtimeMetaTableConfig.TableSchema.Columns["+ j +"].Pk"));
				columnSchemaDTO.setUrl(_ctx.booleanValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.RealtimeMetaTableConfig.TableSchema.Columns["+ j +"].Url"));
				columnSchemaDTO.setName(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.RealtimeMetaTableConfig.TableSchema.Columns["+ j +"].Name"));
				columnSchemaDTO.setMaxCapacity(_ctx.integerValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.RealtimeMetaTableConfig.TableSchema.Columns["+ j +"].MaxCapacity"));

				VectorIndexConfig vectorIndexConfig = new VectorIndexConfig();
				vectorIndexConfig.setSimilarityType(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.RealtimeMetaTableConfig.TableSchema.Columns["+ j +"].VectorIndexConfig.SimilarityType"));
				vectorIndexConfig.setEmbeddingModel(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.RealtimeMetaTableConfig.TableSchema.Columns["+ j +"].VectorIndexConfig.EmbeddingModel"));
				vectorIndexConfig.setDimension(_ctx.longValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.RealtimeMetaTableConfig.TableSchema.Columns["+ j +"].VectorIndexConfig.Dimension"));
				vectorIndexConfig.setIndexParams(_ctx.mapValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.RealtimeMetaTableConfig.TableSchema.Columns["+ j +"].VectorIndexConfig.IndexParams"));
				vectorIndexConfig.setIndexType(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.RealtimeMetaTableConfig.TableSchema.Columns["+ j +"].VectorIndexConfig.IndexType"));
				columnSchemaDTO.setVectorIndexConfig(vectorIndexConfig);

				columns.add(columnSchemaDTO);
			}
			tableSchema.setColumns(columns);
			realtimeMetaTableConfig.setTableSchema(tableSchema);
			dataVersionConfig.setRealtimeMetaTableConfig(realtimeMetaTableConfig);

			MetadataStorageConfig metadataStorageConfig = new MetadataStorageConfig();
			metadataStorageConfig.setTableName(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.MetadataStorageConfig.TableName"));
			metadataStorageConfig.setMetadataStorageMode(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.MetadataStorageConfig.MetadataStorageMode"));
			metadataStorageConfig.setDataSourceName(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.MetadataStorageConfig.DataSourceName"));
			metadataStorageConfig.setMetadataStorageType(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.MetadataStorageConfig.MetadataStorageType"));
			metadataStorageConfig.setProdSchema(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.MetadataStorageConfig.ProdSchema"));
			metadataStorageConfig.setDataSourceId(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.MetadataStorageConfig.DataSourceId"));
			metadataStorageConfig.setDevSchema(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.MetadataStorageConfig.DevSchema"));

			TableSchema1 tableSchema1 = new TableSchema1();

			List<ColumnSchemaDTO3> columns2 = new ArrayList<ColumnSchemaDTO3>();
			for (int j = 0; j < _ctx.lengthValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.MetadataStorageConfig.TableSchema.Columns.Length"); j++) {
				ColumnSchemaDTO3 columnSchemaDTO3 = new ColumnSchemaDTO3();
				columnSchemaDTO3.setComment(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.MetadataStorageConfig.TableSchema.Columns["+ j +"].Comment"));
				columnSchemaDTO3.setType(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.MetadataStorageConfig.TableSchema.Columns["+ j +"].Type"));
				columnSchemaDTO3.setElementType(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.MetadataStorageConfig.TableSchema.Columns["+ j +"].ElementType"));
				columnSchemaDTO3.setPk(_ctx.booleanValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.MetadataStorageConfig.TableSchema.Columns["+ j +"].Pk"));
				columnSchemaDTO3.setUrl(_ctx.booleanValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.MetadataStorageConfig.TableSchema.Columns["+ j +"].Url"));
				columnSchemaDTO3.setName(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.MetadataStorageConfig.TableSchema.Columns["+ j +"].Name"));
				columnSchemaDTO3.setMaxCapacity(_ctx.integerValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.MetadataStorageConfig.TableSchema.Columns["+ j +"].MaxCapacity"));

				VectorIndexConfig4 vectorIndexConfig4 = new VectorIndexConfig4();
				vectorIndexConfig4.setSimilarityType(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.MetadataStorageConfig.TableSchema.Columns["+ j +"].VectorIndexConfig.SimilarityType"));
				vectorIndexConfig4.setEmbeddingModel(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.MetadataStorageConfig.TableSchema.Columns["+ j +"].VectorIndexConfig.EmbeddingModel"));
				vectorIndexConfig4.setDimension(_ctx.longValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.MetadataStorageConfig.TableSchema.Columns["+ j +"].VectorIndexConfig.Dimension"));
				vectorIndexConfig4.setIndexParams(_ctx.mapValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.MetadataStorageConfig.TableSchema.Columns["+ j +"].VectorIndexConfig.IndexParams"));
				vectorIndexConfig4.setIndexType(_ctx.stringValue("GetDatasetResponse.DatasetDTO.VersionList["+ i +"].DataVersionConfig.MetadataStorageConfig.TableSchema.Columns["+ j +"].VectorIndexConfig.IndexType"));
				columnSchemaDTO3.setVectorIndexConfig4(vectorIndexConfig4);

				columns2.add(columnSchemaDTO3);
			}
			tableSchema1.setColumns2(columns2);
			metadataStorageConfig.setTableSchema1(tableSchema1);
			dataVersionConfig.setMetadataStorageConfig(metadataStorageConfig);
			datasetVersionDTO.setDataVersionConfig(dataVersionConfig);

			versionList.add(datasetVersionDTO);
		}
		datasetDTO.setVersionList(versionList);
		getDatasetResponse.setDatasetDTO(datasetDTO);
	 
	 	return getDatasetResponse;
	}
}