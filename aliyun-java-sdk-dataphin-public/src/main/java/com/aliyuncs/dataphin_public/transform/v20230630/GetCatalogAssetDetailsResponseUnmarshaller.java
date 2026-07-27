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

import com.aliyuncs.dataphin_public.model.v20230630.GetCatalogAssetDetailsResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetCatalogAssetDetailsResponse.Data;
import com.aliyuncs.dataphin_public.model.v20230630.GetCatalogAssetDetailsResponse.Data.Column;
import com.aliyuncs.dataphin_public.model.v20230630.GetCatalogAssetDetailsResponse.Data.Column.AssociatedEntity;
import com.aliyuncs.dataphin_public.model.v20230630.GetCatalogAssetDetailsResponse.Data.Column.Standard;
import com.aliyuncs.dataphin_public.model.v20230630.GetCatalogAssetDetailsResponse.Data.CustomAttribute;
import com.aliyuncs.dataphin_public.model.v20230630.GetCatalogAssetDetailsResponse.Data.Directorie;
import com.aliyuncs.dataphin_public.model.v20230630.GetCatalogAssetDetailsResponse.Data.FirstOnShelveUser;
import com.aliyuncs.dataphin_public.model.v20230630.GetCatalogAssetDetailsResponse.Data.LastOnShelveUser;
import com.aliyuncs.dataphin_public.model.v20230630.GetCatalogAssetDetailsResponse.Data.Owner1;
import com.aliyuncs.dataphin_public.model.v20230630.GetCatalogAssetDetailsResponse.Data.SimpleNodeInfo;
import com.aliyuncs.dataphin_public.model.v20230630.GetCatalogAssetDetailsResponse.Data.SimpleNodeInfo.Owner;
import com.aliyuncs.dataphin_public.model.v20230630.GetCatalogAssetDetailsResponse.Data.SimpleNodeInfo.Project;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCatalogAssetDetailsResponseUnmarshaller {

	public static GetCatalogAssetDetailsResponse unmarshall(GetCatalogAssetDetailsResponse getCatalogAssetDetailsResponse, UnmarshallerContext _ctx) {
		
		getCatalogAssetDetailsResponse.setRequestId(_ctx.stringValue("GetCatalogAssetDetailsResponse.RequestId"));
		getCatalogAssetDetailsResponse.setMessage(_ctx.stringValue("GetCatalogAssetDetailsResponse.Message"));
		getCatalogAssetDetailsResponse.setHttpStatusCode(_ctx.integerValue("GetCatalogAssetDetailsResponse.HttpStatusCode"));
		getCatalogAssetDetailsResponse.setCode(_ctx.stringValue("GetCatalogAssetDetailsResponse.Code"));
		getCatalogAssetDetailsResponse.setSuccess(_ctx.booleanValue("GetCatalogAssetDetailsResponse.Success"));

		Data data = new Data();
		data.setApiGroupName(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.ApiGroupName"));
		data.setAssetDescription(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.AssetDescription"));
		data.setGuid(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.Guid"));
		data.setInstruction(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.Instruction"));
		data.setBizUnitId(_ctx.longValue("GetCatalogAssetDetailsResponse.Data.BizUnitId"));
		data.setLastDmlTime(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.LastDmlTime"));
		data.setIsDeleted(_ctx.booleanValue("GetCatalogAssetDetailsResponse.Data.IsDeleted"));
		data.setSubType(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.SubType"));
		data.setLastDdlTime(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.LastDdlTime"));
		data.setAssetName(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.AssetName"));
		data.setTableLifeCycle(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.TableLifeCycle"));
		data.setPartitionKey(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.PartitionKey"));
		data.setAssetDetailUrl(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.AssetDetailUrl"));
		data.setModifyTime(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.ModifyTime"));
		data.setSumTableName(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.SumTableName"));
		data.setLastOnShelveTime(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.LastOnShelveTime"));
		data.setDatasourceId(_ctx.longValue("GetCatalogAssetDetailsResponse.Data.DatasourceId"));
		data.setApiRequestMethod(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.ApiRequestMethod"));
		data.setIsPartitionTable(_ctx.booleanValue("GetCatalogAssetDetailsResponse.Data.IsPartitionTable"));
		data.setDataCellName(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.DataCellName"));
		data.setTableSizeInBytes(_ctx.longValue("GetCatalogAssetDetailsResponse.Data.TableSizeInBytes"));
		data.setProjectName(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.ProjectName"));
		data.setSumTableGuid(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.SumTableGuid"));
		data.setChartCount(_ctx.longValue("GetCatalogAssetDetailsResponse.Data.ChartCount"));
		data.setPrimaryKey(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.PrimaryKey"));
		data.setCollectionCount(_ctx.longValue("GetCatalogAssetDetailsResponse.Data.CollectionCount"));
		data.setAssetFrom(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.AssetFrom"));
		data.setGranularity(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.Granularity"));
		data.setDataCellId(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.DataCellId"));
		data.setMaxSecurityLevel(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.MaxSecurityLevel"));
		data.setBizUnitName(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.BizUnitName"));
		data.setAssetFullName(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.AssetFullName"));
		data.setShelveViewScopeType(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.ShelveViewScopeType"));
		data.setBiCatalog(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.BiCatalog"));
		data.setCreateTime(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.CreateTime"));
		data.setProjectId(_ctx.longValue("GetCatalogAssetDetailsResponse.Data.ProjectId"));
		data.setApiCallMode(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.ApiCallMode"));
		data.setAssetType(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.AssetType"));
		data.setDataSourceName(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.DataSourceName"));
		data.setProfilingReportViewScopeType(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.ProfilingReportViewScopeType"));
		data.setAssetDisplayName(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.AssetDisplayName"));
		data.setApiId(_ctx.longValue("GetCatalogAssetDetailsResponse.Data.ApiId"));
		data.setFirstOnShelveTime(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.FirstOnShelveTime"));
		data.setReadCount(_ctx.longValue("GetCatalogAssetDetailsResponse.Data.ReadCount"));

		List<String> profilingReportViewScopeUserIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetCatalogAssetDetailsResponse.Data.ProfilingReportViewScopeUserIds.Length"); i++) {
			profilingReportViewScopeUserIds.add(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.ProfilingReportViewScopeUserIds["+ i +"]"));
		}
		data.setProfilingReportViewScopeUserIds(profilingReportViewScopeUserIds);

		List<String> maintainUserIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetCatalogAssetDetailsResponse.Data.MaintainUserIds.Length"); i++) {
			maintainUserIds.add(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.MaintainUserIds["+ i +"]"));
		}
		data.setMaintainUserIds(maintainUserIds);

		List<String> maintainUserGroups = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetCatalogAssetDetailsResponse.Data.MaintainUserGroups.Length"); i++) {
			maintainUserGroups.add(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.MaintainUserGroups["+ i +"]"));
		}
		data.setMaintainUserGroups(maintainUserGroups);

		List<String> profilingReportViewScopeUserGroups = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetCatalogAssetDetailsResponse.Data.ProfilingReportViewScopeUserGroups.Length"); i++) {
			profilingReportViewScopeUserGroups.add(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.ProfilingReportViewScopeUserGroups["+ i +"]"));
		}
		data.setProfilingReportViewScopeUserGroups(profilingReportViewScopeUserGroups);

		List<String> shelveViewScopeUserGroups = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetCatalogAssetDetailsResponse.Data.ShelveViewScopeUserGroups.Length"); i++) {
			shelveViewScopeUserGroups.add(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.ShelveViewScopeUserGroups["+ i +"]"));
		}
		data.setShelveViewScopeUserGroups(shelveViewScopeUserGroups);

		List<String> assetTags = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetCatalogAssetDetailsResponse.Data.AssetTags.Length"); i++) {
			assetTags.add(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.AssetTags["+ i +"]"));
		}
		data.setAssetTags(assetTags);

		List<String> shelveViewScopeUserIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetCatalogAssetDetailsResponse.Data.ShelveViewScopeUserIds.Length"); i++) {
			shelveViewScopeUserIds.add(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.ShelveViewScopeUserIds["+ i +"]"));
		}
		data.setShelveViewScopeUserIds(shelveViewScopeUserIds);

		Owner1 owner1 = new Owner1();
		owner1.setUserId(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.Owner.UserId"));
		owner1.setDisplayName(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.Owner.DisplayName"));
		data.setOwner1(owner1);

		LastOnShelveUser lastOnShelveUser = new LastOnShelveUser();
		lastOnShelveUser.setUserId(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.LastOnShelveUser.UserId"));
		lastOnShelveUser.setDisplayName(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.LastOnShelveUser.DisplayName"));
		data.setLastOnShelveUser(lastOnShelveUser);

		FirstOnShelveUser firstOnShelveUser = new FirstOnShelveUser();
		firstOnShelveUser.setUserId(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.FirstOnShelveUser.UserId"));
		firstOnShelveUser.setDisplayName(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.FirstOnShelveUser.DisplayName"));
		data.setFirstOnShelveUser(firstOnShelveUser);

		List<CustomAttribute> customAttributes = new ArrayList<CustomAttribute>();
		for (int i = 0; i < _ctx.lengthValue("GetCatalogAssetDetailsResponse.Data.CustomAttributes.Length"); i++) {
			CustomAttribute customAttribute = new CustomAttribute();
			customAttribute.setAttrType(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.CustomAttributes["+ i +"].AttrType"));
			customAttribute.setValue(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.CustomAttributes["+ i +"].Value"));
			customAttribute.setCode(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.CustomAttributes["+ i +"].Code"));
			customAttribute.setName(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.CustomAttributes["+ i +"].Name"));

			customAttributes.add(customAttribute);
		}
		data.setCustomAttributes(customAttributes);

		List<Directorie> directories = new ArrayList<Directorie>();
		for (int i = 0; i < _ctx.lengthValue("GetCatalogAssetDetailsResponse.Data.Directories.Length"); i++) {
			Directorie directorie = new Directorie();
			directorie.setDirectoryId(_ctx.longValue("GetCatalogAssetDetailsResponse.Data.Directories["+ i +"].DirectoryId"));
			directorie.setTopicId(_ctx.longValue("GetCatalogAssetDetailsResponse.Data.Directories["+ i +"].TopicId"));
			directorie.setDirectoryName(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.Directories["+ i +"].DirectoryName"));
			directorie.setTopicName(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.Directories["+ i +"].TopicName"));

			directories.add(directorie);
		}
		data.setDirectories(directories);

		List<Column> columns = new ArrayList<Column>();
		for (int i = 0; i < _ctx.lengthValue("GetCatalogAssetDetailsResponse.Data.Columns.Length"); i++) {
			Column column = new Column();
			column.setClassifyName(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.Columns["+ i +"].ClassifyName"));
			column.setDescription(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.Columns["+ i +"].Description"));
			column.setQualityScore(_ctx.doubleValue("GetCatalogAssetDetailsResponse.Data.Columns["+ i +"].QualityScore"));
			column.setDisplayName(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.Columns["+ i +"].DisplayName"));
			column.setDataType(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.Columns["+ i +"].DataType"));
			column.setBizType(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.Columns["+ i +"].BizType"));
			column.setGuid(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.Columns["+ i +"].Guid"));
			column.setLevelShortName(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.Columns["+ i +"].LevelShortName"));
			column.setName(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.Columns["+ i +"].Name"));

			AssociatedEntity associatedEntity = new AssociatedEntity();
			associatedEntity.setBizUnitId(_ctx.longValue("GetCatalogAssetDetailsResponse.Data.Columns["+ i +"].AssociatedEntity.BizUnitId"));
			associatedEntity.setDimensionDisplayName(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.Columns["+ i +"].AssociatedEntity.DimensionDisplayName"));
			associatedEntity.setBizUnitName(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.Columns["+ i +"].AssociatedEntity.BizUnitName"));
			associatedEntity.setDimensionId(_ctx.longValue("GetCatalogAssetDetailsResponse.Data.Columns["+ i +"].AssociatedEntity.DimensionId"));
			associatedEntity.setDimensionName(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.Columns["+ i +"].AssociatedEntity.DimensionName"));
			column.setAssociatedEntity(associatedEntity);

			List<Standard> standards = new ArrayList<Standard>();
			for (int j = 0; j < _ctx.lengthValue("GetCatalogAssetDetailsResponse.Data.Columns["+ i +"].Standards.Length"); j++) {
				Standard standard = new Standard();
				standard.setId(_ctx.longValue("GetCatalogAssetDetailsResponse.Data.Columns["+ i +"].Standards["+ j +"].Id"));
				standard.setCode(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.Columns["+ i +"].Standards["+ j +"].Code"));
				standard.setName(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.Columns["+ i +"].Standards["+ j +"].Name"));

				standards.add(standard);
			}
			column.setStandards(standards);

			columns.add(column);
		}
		data.setColumns(columns);

		List<SimpleNodeInfo> simpleNodeInfos = new ArrayList<SimpleNodeInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetCatalogAssetDetailsResponse.Data.SimpleNodeInfos.Length"); i++) {
			SimpleNodeInfo simpleNodeInfo = new SimpleNodeInfo();
			simpleNodeInfo.setBizUnit(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.SimpleNodeInfos["+ i +"].BizUnit"));
			simpleNodeInfo.setNodeName(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.SimpleNodeInfos["+ i +"].NodeName"));
			simpleNodeInfo.setNodeId(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.SimpleNodeInfos["+ i +"].NodeId"));
			simpleNodeInfo.setNodeScheduleType(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.SimpleNodeInfos["+ i +"].NodeScheduleType"));
			simpleNodeInfo.setEnv(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.SimpleNodeInfos["+ i +"].Env"));
			simpleNodeInfo.setSubBizType(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.SimpleNodeInfos["+ i +"].SubBizType"));

			Project project = new Project();
			project.setProjectName(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.SimpleNodeInfos["+ i +"].Project.ProjectName"));
			project.setProjectId(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.SimpleNodeInfos["+ i +"].Project.ProjectId"));
			simpleNodeInfo.setProject(project);

			List<Owner> owners = new ArrayList<Owner>();
			for (int j = 0; j < _ctx.lengthValue("GetCatalogAssetDetailsResponse.Data.SimpleNodeInfos["+ i +"].Owners.Length"); j++) {
				Owner owner = new Owner();
				owner.setUserId(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.SimpleNodeInfos["+ i +"].Owners["+ j +"].UserId"));
				owner.setDisplayName(_ctx.stringValue("GetCatalogAssetDetailsResponse.Data.SimpleNodeInfos["+ i +"].Owners["+ j +"].DisplayName"));

				owners.add(owner);
			}
			simpleNodeInfo.setOwners(owners);

			simpleNodeInfos.add(simpleNodeInfo);
		}
		data.setSimpleNodeInfos(simpleNodeInfos);
		getCatalogAssetDetailsResponse.setData(data);
	 
	 	return getCatalogAssetDetailsResponse;
	}
}