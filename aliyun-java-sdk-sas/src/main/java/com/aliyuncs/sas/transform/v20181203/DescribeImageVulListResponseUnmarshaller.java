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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeImageVulListResponse;
import com.aliyuncs.sas.model.v20181203.DescribeImageVulListResponse.VulRecord;
import com.aliyuncs.sas.model.v20181203.DescribeImageVulListResponse.VulRecord.ExtendContentJson;
import com.aliyuncs.sas.model.v20181203.DescribeImageVulListResponse.VulRecord.ExtendContentJson.RpmEntity;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeImageVulListResponseUnmarshaller {

	public static DescribeImageVulListResponse unmarshall(DescribeImageVulListResponse describeImageVulListResponse, UnmarshallerContext _ctx) {
		
		describeImageVulListResponse.setRequestId(_ctx.stringValue("DescribeImageVulListResponse.RequestId"));
		describeImageVulListResponse.setCurrentPage(_ctx.integerValue("DescribeImageVulListResponse.CurrentPage"));
		describeImageVulListResponse.setPageSize(_ctx.integerValue("DescribeImageVulListResponse.PageSize"));
		describeImageVulListResponse.setTotalCount(_ctx.integerValue("DescribeImageVulListResponse.TotalCount"));

		List<VulRecord> vulRecords = new ArrayList<VulRecord>();
		for (int i = 0; i < _ctx.lengthValue("DescribeImageVulListResponse.VulRecords.Length"); i++) {
			VulRecord vulRecord = new VulRecord();
			vulRecord.setCanUpdate(_ctx.booleanValue("DescribeImageVulListResponse.VulRecords["+ i +"].CanUpdate"));
			vulRecord.setType(_ctx.stringValue("DescribeImageVulListResponse.VulRecords["+ i +"].Type"));
			vulRecord.setStatus(_ctx.integerValue("DescribeImageVulListResponse.VulRecords["+ i +"].Status"));
			vulRecord.setModifyTs(_ctx.longValue("DescribeImageVulListResponse.VulRecords["+ i +"].ModifyTs"));
			vulRecord.setProgress(_ctx.integerValue("DescribeImageVulListResponse.VulRecords["+ i +"].Progress"));
			vulRecord.setImageDigest(_ctx.stringValue("DescribeImageVulListResponse.VulRecords["+ i +"].ImageDigest"));
			vulRecord.setPrimaryId(_ctx.longValue("DescribeImageVulListResponse.VulRecords["+ i +"].PrimaryId"));
			vulRecord.setTag(_ctx.stringValue("DescribeImageVulListResponse.VulRecords["+ i +"].Tag"));
			vulRecord.setRepoNamespace(_ctx.stringValue("DescribeImageVulListResponse.VulRecords["+ i +"].RepoNamespace"));
			vulRecord.setRepoName(_ctx.stringValue("DescribeImageVulListResponse.VulRecords["+ i +"].RepoName"));
			vulRecord.setRelated(_ctx.stringValue("DescribeImageVulListResponse.VulRecords["+ i +"].Related"));
			vulRecord.setFirstTs(_ctx.longValue("DescribeImageVulListResponse.VulRecords["+ i +"].FirstTs"));
			vulRecord.setLastTs(_ctx.longValue("DescribeImageVulListResponse.VulRecords["+ i +"].LastTs"));
			vulRecord.setNecessity(_ctx.stringValue("DescribeImageVulListResponse.VulRecords["+ i +"].Necessity"));
			vulRecord.setUuid(_ctx.stringValue("DescribeImageVulListResponse.VulRecords["+ i +"].Uuid"));
			vulRecord.setAliasName(_ctx.stringValue("DescribeImageVulListResponse.VulRecords["+ i +"].AliasName"));
			vulRecord.setName(_ctx.stringValue("DescribeImageVulListResponse.VulRecords["+ i +"].Name"));
			vulRecord.setLevel(_ctx.stringValue("DescribeImageVulListResponse.VulRecords["+ i +"].Level"));
			vulRecord.setCanFix(_ctx.stringValue("DescribeImageVulListResponse.VulRecords["+ i +"].CanFix"));

			List<String> layers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeImageVulListResponse.VulRecords["+ i +"].Layers.Length"); j++) {
				layers.add(_ctx.stringValue("DescribeImageVulListResponse.VulRecords["+ i +"].Layers["+ j +"]"));
			}
			vulRecord.setLayers(layers);

			ExtendContentJson extendContentJson = new ExtendContentJson();
			extendContentJson.setOsRelease(_ctx.stringValue("DescribeImageVulListResponse.VulRecords["+ i +"].ExtendContentJson.OsRelease"));
			extendContentJson.setOs(_ctx.stringValue("DescribeImageVulListResponse.VulRecords["+ i +"].ExtendContentJson.Os"));

			List<RpmEntity> rpmEntityList = new ArrayList<RpmEntity>();
			for (int j = 0; j < _ctx.lengthValue("DescribeImageVulListResponse.VulRecords["+ i +"].ExtendContentJson.RpmEntityList.Length"); j++) {
				RpmEntity rpmEntity = new RpmEntity();
				rpmEntity.setLayer(_ctx.stringValue("DescribeImageVulListResponse.VulRecords["+ i +"].ExtendContentJson.RpmEntityList["+ j +"].Layer"));
				rpmEntity.setFullVersion(_ctx.stringValue("DescribeImageVulListResponse.VulRecords["+ i +"].ExtendContentJson.RpmEntityList["+ j +"].FullVersion"));
				rpmEntity.setVersion(_ctx.stringValue("DescribeImageVulListResponse.VulRecords["+ i +"].ExtendContentJson.RpmEntityList["+ j +"].Version"));
				rpmEntity.setMatchDetail(_ctx.stringValue("DescribeImageVulListResponse.VulRecords["+ i +"].ExtendContentJson.RpmEntityList["+ j +"].MatchDetail"));
				rpmEntity.setPath(_ctx.stringValue("DescribeImageVulListResponse.VulRecords["+ i +"].ExtendContentJson.RpmEntityList["+ j +"].Path"));
				rpmEntity.setName(_ctx.stringValue("DescribeImageVulListResponse.VulRecords["+ i +"].ExtendContentJson.RpmEntityList["+ j +"].Name"));
				rpmEntity.setUpdateCmd(_ctx.stringValue("DescribeImageVulListResponse.VulRecords["+ i +"].ExtendContentJson.RpmEntityList["+ j +"].UpdateCmd"));

				List<String> matchList = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeImageVulListResponse.VulRecords["+ i +"].ExtendContentJson.RpmEntityList["+ j +"].MatchList.Length"); k++) {
					matchList.add(_ctx.stringValue("DescribeImageVulListResponse.VulRecords["+ i +"].ExtendContentJson.RpmEntityList["+ j +"].MatchList["+ k +"]"));
				}
				rpmEntity.setMatchList(matchList);

				rpmEntityList.add(rpmEntity);
			}
			extendContentJson.setRpmEntityList(rpmEntityList);
			vulRecord.setExtendContentJson(extendContentJson);

			vulRecords.add(vulRecord);
		}
		describeImageVulListResponse.setVulRecords(vulRecords);
	 
	 	return describeImageVulListResponse;
	}
}