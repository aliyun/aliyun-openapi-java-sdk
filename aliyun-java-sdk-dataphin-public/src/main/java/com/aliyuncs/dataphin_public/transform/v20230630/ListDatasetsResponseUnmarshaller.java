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
import com.aliyuncs.dataphin_public.model.v20230630.ListDatasetsResponse.PageResult.DatasetDTO.DatasetVersionDTO.ApiInfo;
import com.aliyuncs.dataphin_public.model.v20230630.ListDatasetsResponse.PageResult.DatasetDTO.DatasetVersionDTO.ApiInfo.ApiRequestParamDTO;
import com.aliyuncs.dataphin_public.model.v20230630.ListDatasetsResponse.PageResult.DatasetDTO.DatasetVersionDTO.ApiInfo.ApiResponseParamDTO;
import com.aliyuncs.dataphin_public.model.v20230630.ListDatasetsResponse.PageResult.DatasetDTO.DatasetVersionDTO.DataVersionConfig;
import com.aliyuncs.dataphin_public.model.v20230630.ListDatasetsResponse.PageResult.DatasetDTO.DatasetVersionDTO.DataVersionConfig.FileStorageConfig;
import com.aliyuncs.dataphin_public.model.v20230630.ListDatasetsResponse.PageResult.DatasetDTO.DatasetVersionDTO.DataVersionConfig.MetadataStorageConfig;
import com.aliyuncs.dataphin_public.model.v20230630.ListDatasetsResponse.PageResult.DatasetDTO.DatasetVersionDTO.DataVersionConfig.MetadataStorageConfig.TableSchema1;
import com.aliyuncs.dataphin_public.model.v20230630.ListDatasetsResponse.PageResult.DatasetDTO.DatasetVersionDTO.DataVersionConfig.MetadataStorageConfig.TableSchema1.ColumnSchemaDTO3;
import com.aliyuncs.dataphin_public.model.v20230630.ListDatasetsResponse.PageResult.DatasetDTO.DatasetVersionDTO.DataVersionConfig.MetadataStorageConfig.TableSchema1.ColumnSchemaDTO3.VectorIndexConfig4;
import com.aliyuncs.dataphin_public.model.v20230630.ListDatasetsResponse.PageResult.DatasetDTO.DatasetVersionDTO.DataVersionConfig.RealtimeMetaTableConfig;
import com.aliyuncs.dataphin_public.model.v20230630.ListDatasetsResponse.PageResult.DatasetDTO.DatasetVersionDTO.DataVersionConfig.RealtimeMetaTableConfig.TableSchema;
import com.aliyuncs.dataphin_public.model.v20230630.ListDatasetsResponse.PageResult.DatasetDTO.DatasetVersionDTO.DataVersionConfig.RealtimeMetaTableConfig.TableSchema.ColumnSchemaDTO;
import com.aliyuncs.dataphin_public.model.v20230630.ListDatasetsResponse.PageResult.DatasetDTO.DatasetVersionDTO.DataVersionConfig.RealtimeMetaTableConfig.TableSchema.ColumnSchemaDTO.VectorIndexConfig;
import com.aliyuncs.dataphin_public.model.v20230630.ListDatasetsResponse.PageResult.DatasetDTO.Owner;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDatasetsResponseUnmarshaller {

	public static ListDatasetsResponse unmarshall(ListDatasetsResponse listDatasetsResponse, UnmarshallerContext _ctx) {
		
		listDatasetsResponse.setRequestId(_ctx.stringValue("ListDatasetsResponse.RequestId"));
		listDatasetsResponse.setMessage(_ctx.stringValue("ListDatasetsResponse.Message"));
		listDatasetsResponse.setHttpStatusCode(_ctx.integerValue("ListDatasetsResponse.HttpStatusCode"));
		listDatasetsResponse.setCode(_ctx.stringValue("ListDatasetsResponse.Code"));
		listDatasetsResponse.setSuccess(_ctx.booleanValue("ListDatasetsResponse.Success"));

		PageResult pageResult = new PageResult();
		pageResult.setCount(_ctx.integerValue("ListDatasetsResponse.PageResult.Count"));

		List<DatasetDTO> resultData = new ArrayList<DatasetDTO>();
		for (int i = 0; i < _ctx.lengthValue("ListDatasetsResponse.PageResult.ResultData.Length"); i++) {
			DatasetDTO datasetDTO = new DatasetDTO();
			datasetDTO.setStorageType(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].StorageType"));
			datasetDTO.setDescription(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].Description"));
			datasetDTO.setDataCellName(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].DataCellName"));
			datasetDTO.setContentType(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].ContentType"));
			datasetDTO.setProjectName(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].ProjectName"));
			datasetDTO.setProjectId(_ctx.longValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].ProjectId"));
			datasetDTO.setGmtModified(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].GmtModified"));
			datasetDTO.setMetadataStorageType(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].MetadataStorageType"));
			datasetDTO.setCreator(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].Creator"));
			datasetDTO.setLockOwner(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].LockOwner"));
			datasetDTO.setDataCellId(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].DataCellId"));
			datasetDTO.setName(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].Name"));
			datasetDTO.setScenario(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].Scenario"));
			datasetDTO.setType(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].Type"));
			datasetDTO.setGmtCreate(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].GmtCreate"));
			datasetDTO.setTenantId(_ctx.longValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].TenantId"));
			datasetDTO.setFileId(_ctx.longValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].FileId"));
			datasetDTO.setId(_ctx.longValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].Id"));
			datasetDTO.setCreatorName(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].CreatorName"));
			datasetDTO.setDirectory(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].Directory"));
			datasetDTO.setLockOwnerName(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].LockOwnerName"));

			List<Owner> ownerList = new ArrayList<Owner>();
			for (int j = 0; j < _ctx.lengthValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].OwnerList.Length"); j++) {
				Owner owner = new Owner();
				owner.setUserName(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].OwnerList["+ j +"].UserName"));
				owner.setUserId(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].OwnerList["+ j +"].UserId"));

				ownerList.add(owner);
			}
			datasetDTO.setOwnerList(ownerList);

			List<DatasetVersionDTO> versionList = new ArrayList<DatasetVersionDTO>();
			for (int j = 0; j < _ctx.lengthValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList.Length"); j++) {
				DatasetVersionDTO datasetVersionDTO = new DatasetVersionDTO();
				datasetVersionDTO.setGmtCreate(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].GmtCreate"));
				datasetVersionDTO.setVersion(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].Version"));
				datasetVersionDTO.setGmtModified(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].GmtModified"));
				datasetVersionDTO.setId(_ctx.longValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].Id"));
				datasetVersionDTO.setCreator(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].Creator"));
				datasetVersionDTO.setDatasetId(_ctx.longValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DatasetId"));

				ApiInfo apiInfo = new ApiInfo();
				apiInfo.setOsApiGroup(_ctx.integerValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].ApiInfo.OsApiGroup"));
				apiInfo.setApiNo(_ctx.longValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].ApiInfo.ApiNo"));
				apiInfo.setOsApiGroupName(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].ApiInfo.OsApiGroupName"));
				apiInfo.setRequestMethod(_ctx.integerValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].ApiInfo.RequestMethod"));
				apiInfo.setTimeout(_ctx.integerValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].ApiInfo.Timeout"));
				apiInfo.setOsProject(_ctx.integerValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].ApiInfo.OsProject"));
				apiInfo.setBizProtocol(_ctx.integerValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].ApiInfo.Protocol"));
				apiInfo.setExecuteMode(_ctx.integerValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].ApiInfo.ExecuteMode"));
				apiInfo.setExecTimeout(_ctx.integerValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].ApiInfo.ExecTimeout"));
				apiInfo.setOsProjectName(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].ApiInfo.OsProjectName"));

				List<ApiResponseParamDTO> responseParamList = new ArrayList<ApiResponseParamDTO>();
				for (int k = 0; k < _ctx.lengthValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].ApiInfo.ResponseParamList.Length"); k++) {
					ApiResponseParamDTO apiResponseParamDTO = new ApiResponseParamDTO();
					apiResponseParamDTO.setSeqNum(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].ApiInfo.ResponseParamList["+ k +"].SeqNum"));
					apiResponseParamDTO.setMappingColumn(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].ApiInfo.ResponseParamList["+ k +"].MappingColumn"));
					apiResponseParamDTO.setSample(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].ApiInfo.ResponseParamList["+ k +"].Sample"));
					apiResponseParamDTO.setDateFormat(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].ApiInfo.ResponseParamList["+ k +"].DateFormat"));
					apiResponseParamDTO.setDescr(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].ApiInfo.ResponseParamList["+ k +"].Descr"));
					apiResponseParamDTO.setParamName(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].ApiInfo.ResponseParamList["+ k +"].ParamName"));
					apiResponseParamDTO.setParamType(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].ApiInfo.ResponseParamList["+ k +"].ParamType"));
					apiResponseParamDTO.setIsUrl(_ctx.booleanValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].ApiInfo.ResponseParamList["+ k +"].IsUrl"));
					apiResponseParamDTO.setOriginalColumn(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].ApiInfo.ResponseParamList["+ k +"].OriginalColumn"));

					responseParamList.add(apiResponseParamDTO);
				}
				apiInfo.setResponseParamList(responseParamList);

				List<ApiRequestParamDTO> requestParamList = new ArrayList<ApiRequestParamDTO>();
				for (int k = 0; k < _ctx.lengthValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].ApiInfo.RequestParamList.Length"); k++) {
					ApiRequestParamDTO apiRequestParamDTO = new ApiRequestParamDTO();
					apiRequestParamDTO.setOperator(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].ApiInfo.RequestParamList["+ k +"].Operator"));
					apiRequestParamDTO.setSeqNum(_ctx.integerValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].ApiInfo.RequestParamList["+ k +"].SeqNum"));
					apiRequestParamDTO.setOptional(_ctx.booleanValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].ApiInfo.RequestParamList["+ k +"].Optional"));
					apiRequestParamDTO.setMappingColumn(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].ApiInfo.RequestParamList["+ k +"].MappingColumn"));
					apiRequestParamDTO.setSample(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].ApiInfo.RequestParamList["+ k +"].Sample"));
					apiRequestParamDTO.setDescr(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].ApiInfo.RequestParamList["+ k +"].Descr"));
					apiRequestParamDTO.setMust(_ctx.booleanValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].ApiInfo.RequestParamList["+ k +"].Must"));
					apiRequestParamDTO.setParamType(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].ApiInfo.RequestParamList["+ k +"].ParamType"));
					apiRequestParamDTO.setOriginalColumn(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].ApiInfo.RequestParamList["+ k +"].OriginalColumn"));
					apiRequestParamDTO.setDefaultValue(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].ApiInfo.RequestParamList["+ k +"].DefaultValue"));
					apiRequestParamDTO.setDateFormat(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].ApiInfo.RequestParamList["+ k +"].DateFormat"));
					apiRequestParamDTO.setParamName(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].ApiInfo.RequestParamList["+ k +"].ParamName"));
					apiRequestParamDTO.setIsUrl(_ctx.booleanValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].ApiInfo.RequestParamList["+ k +"].IsUrl"));

					requestParamList.add(apiRequestParamDTO);
				}
				apiInfo.setRequestParamList(requestParamList);
				datasetVersionDTO.setApiInfo(apiInfo);

				DataVersionConfig dataVersionConfig = new DataVersionConfig();
				dataVersionConfig.setVersionDescription(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.VersionDescription"));

				FileStorageConfig fileStorageConfig = new FileStorageConfig();
				fileStorageConfig.setMountPath(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.FileStorageConfig.MountPath"));
				fileStorageConfig.setDataSourceName(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.FileStorageConfig.DataSourceName"));
				fileStorageConfig.setProdPath(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.FileStorageConfig.ProdPath"));
				fileStorageConfig.setDataSourceId(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.FileStorageConfig.DataSourceId"));
				fileStorageConfig.setDevPath(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.FileStorageConfig.DevPath"));
				dataVersionConfig.setFileStorageConfig(fileStorageConfig);

				RealtimeMetaTableConfig realtimeMetaTableConfig = new RealtimeMetaTableConfig();
				realtimeMetaTableConfig.setProjectId(_ctx.longValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.RealtimeMetaTableConfig.ProjectId"));
				realtimeMetaTableConfig.setMetaTableName(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.RealtimeMetaTableConfig.MetaTableName"));
				realtimeMetaTableConfig.setDatasourceType(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.RealtimeMetaTableConfig.DatasourceType"));

				TableSchema tableSchema = new TableSchema();

				List<ColumnSchemaDTO> columns = new ArrayList<ColumnSchemaDTO>();
				for (int k = 0; k < _ctx.lengthValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.RealtimeMetaTableConfig.TableSchema.Columns.Length"); k++) {
					ColumnSchemaDTO columnSchemaDTO = new ColumnSchemaDTO();
					columnSchemaDTO.setComment(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.RealtimeMetaTableConfig.TableSchema.Columns["+ k +"].Comment"));
					columnSchemaDTO.setType(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.RealtimeMetaTableConfig.TableSchema.Columns["+ k +"].Type"));
					columnSchemaDTO.setElementType(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.RealtimeMetaTableConfig.TableSchema.Columns["+ k +"].ElementType"));
					columnSchemaDTO.setPk(_ctx.booleanValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.RealtimeMetaTableConfig.TableSchema.Columns["+ k +"].Pk"));
					columnSchemaDTO.setUrl(_ctx.booleanValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.RealtimeMetaTableConfig.TableSchema.Columns["+ k +"].Url"));
					columnSchemaDTO.setName(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.RealtimeMetaTableConfig.TableSchema.Columns["+ k +"].Name"));
					columnSchemaDTO.setMaxCapacity(_ctx.integerValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.RealtimeMetaTableConfig.TableSchema.Columns["+ k +"].MaxCapacity"));

					VectorIndexConfig vectorIndexConfig = new VectorIndexConfig();
					vectorIndexConfig.setSimilarityType(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.RealtimeMetaTableConfig.TableSchema.Columns["+ k +"].VectorIndexConfig.SimilarityType"));
					vectorIndexConfig.setEmbeddingModel(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.RealtimeMetaTableConfig.TableSchema.Columns["+ k +"].VectorIndexConfig.EmbeddingModel"));
					vectorIndexConfig.setDimension(_ctx.longValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.RealtimeMetaTableConfig.TableSchema.Columns["+ k +"].VectorIndexConfig.Dimension"));
					vectorIndexConfig.setIndexParams(_ctx.mapValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.RealtimeMetaTableConfig.TableSchema.Columns["+ k +"].VectorIndexConfig.IndexParams"));
					vectorIndexConfig.setIndexType(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.RealtimeMetaTableConfig.TableSchema.Columns["+ k +"].VectorIndexConfig.IndexType"));
					columnSchemaDTO.setVectorIndexConfig(vectorIndexConfig);

					columns.add(columnSchemaDTO);
				}
				tableSchema.setColumns(columns);
				realtimeMetaTableConfig.setTableSchema(tableSchema);
				dataVersionConfig.setRealtimeMetaTableConfig(realtimeMetaTableConfig);

				MetadataStorageConfig metadataStorageConfig = new MetadataStorageConfig();
				metadataStorageConfig.setTableName(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.MetadataStorageConfig.TableName"));
				metadataStorageConfig.setMetadataStorageMode(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.MetadataStorageConfig.MetadataStorageMode"));
				metadataStorageConfig.setDataSourceName(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.MetadataStorageConfig.DataSourceName"));
				metadataStorageConfig.setMetadataStorageType(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.MetadataStorageConfig.MetadataStorageType"));
				metadataStorageConfig.setProdSchema(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.MetadataStorageConfig.ProdSchema"));
				metadataStorageConfig.setDataSourceId(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.MetadataStorageConfig.DataSourceId"));
				metadataStorageConfig.setDevSchema(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.MetadataStorageConfig.DevSchema"));

				TableSchema1 tableSchema1 = new TableSchema1();

				List<ColumnSchemaDTO3> columns2 = new ArrayList<ColumnSchemaDTO3>();
				for (int k = 0; k < _ctx.lengthValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.MetadataStorageConfig.TableSchema.Columns.Length"); k++) {
					ColumnSchemaDTO3 columnSchemaDTO3 = new ColumnSchemaDTO3();
					columnSchemaDTO3.setComment(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.MetadataStorageConfig.TableSchema.Columns["+ k +"].Comment"));
					columnSchemaDTO3.setType(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.MetadataStorageConfig.TableSchema.Columns["+ k +"].Type"));
					columnSchemaDTO3.setElementType(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.MetadataStorageConfig.TableSchema.Columns["+ k +"].ElementType"));
					columnSchemaDTO3.setPk(_ctx.booleanValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.MetadataStorageConfig.TableSchema.Columns["+ k +"].Pk"));
					columnSchemaDTO3.setUrl(_ctx.booleanValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.MetadataStorageConfig.TableSchema.Columns["+ k +"].Url"));
					columnSchemaDTO3.setName(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.MetadataStorageConfig.TableSchema.Columns["+ k +"].Name"));
					columnSchemaDTO3.setMaxCapacity(_ctx.integerValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.MetadataStorageConfig.TableSchema.Columns["+ k +"].MaxCapacity"));

					VectorIndexConfig4 vectorIndexConfig4 = new VectorIndexConfig4();
					vectorIndexConfig4.setSimilarityType(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.MetadataStorageConfig.TableSchema.Columns["+ k +"].VectorIndexConfig.SimilarityType"));
					vectorIndexConfig4.setEmbeddingModel(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.MetadataStorageConfig.TableSchema.Columns["+ k +"].VectorIndexConfig.EmbeddingModel"));
					vectorIndexConfig4.setDimension(_ctx.longValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.MetadataStorageConfig.TableSchema.Columns["+ k +"].VectorIndexConfig.Dimension"));
					vectorIndexConfig4.setIndexParams(_ctx.mapValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.MetadataStorageConfig.TableSchema.Columns["+ k +"].VectorIndexConfig.IndexParams"));
					vectorIndexConfig4.setIndexType(_ctx.stringValue("ListDatasetsResponse.PageResult.ResultData["+ i +"].VersionList["+ j +"].DataVersionConfig.MetadataStorageConfig.TableSchema.Columns["+ k +"].VectorIndexConfig.IndexType"));
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

			resultData.add(datasetDTO);
		}
		pageResult.setResultData(resultData);
		listDatasetsResponse.setPageResult(pageResult);
	 
	 	return listDatasetsResponse;
	}
}