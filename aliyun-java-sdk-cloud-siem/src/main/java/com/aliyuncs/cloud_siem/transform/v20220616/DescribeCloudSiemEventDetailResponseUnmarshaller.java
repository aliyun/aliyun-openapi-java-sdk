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

package com.aliyuncs.cloud_siem.transform.v20220616;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloud_siem.model.v20220616.DescribeCloudSiemEventDetailResponse;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeCloudSiemEventDetailResponse.Data;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeCloudSiemEventDetailResponse.Data.AttckStage;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCloudSiemEventDetailResponseUnmarshaller {

	public static DescribeCloudSiemEventDetailResponse unmarshall(DescribeCloudSiemEventDetailResponse describeCloudSiemEventDetailResponse, UnmarshallerContext _ctx) {
		
		describeCloudSiemEventDetailResponse.setRequestId(_ctx.stringValue("DescribeCloudSiemEventDetailResponse.RequestId"));
		describeCloudSiemEventDetailResponse.setSuccess(_ctx.booleanValue("DescribeCloudSiemEventDetailResponse.Success"));
		describeCloudSiemEventDetailResponse.setCode(_ctx.integerValue("DescribeCloudSiemEventDetailResponse.Code"));
		describeCloudSiemEventDetailResponse.setMessage(_ctx.stringValue("DescribeCloudSiemEventDetailResponse.Message"));

		Data data = new Data();
		data.setGmtCreate(_ctx.stringValue("DescribeCloudSiemEventDetailResponse.Data.GmtCreate"));
		data.setGmtModified(_ctx.stringValue("DescribeCloudSiemEventDetailResponse.Data.GmtModified"));
		data.setAliuid(_ctx.longValue("DescribeCloudSiemEventDetailResponse.Data.Aliuid"));
		data.setAlertNum(_ctx.integerValue("DescribeCloudSiemEventDetailResponse.Data.AlertNum"));
		data.setAssetNum(_ctx.integerValue("DescribeCloudSiemEventDetailResponse.Data.AssetNum"));
		data.setIncidentUuid(_ctx.stringValue("DescribeCloudSiemEventDetailResponse.Data.IncidentUuid"));
		data.setIncidentName(_ctx.stringValue("DescribeCloudSiemEventDetailResponse.Data.IncidentName"));
		data.setIncidentNameEn(_ctx.stringValue("DescribeCloudSiemEventDetailResponse.Data.IncidentNameEn"));
		data.setDescription(_ctx.stringValue("DescribeCloudSiemEventDetailResponse.Data.Description"));
		data.setDescriptionEn(_ctx.stringValue("DescribeCloudSiemEventDetailResponse.Data.DescriptionEn"));
		data.setThreatLevel(_ctx.stringValue("DescribeCloudSiemEventDetailResponse.Data.ThreatLevel"));
		data.setThreatScore(_ctx.floatValue("DescribeCloudSiemEventDetailResponse.Data.ThreatScore"));
		data.setExtContent(_ctx.stringValue("DescribeCloudSiemEventDetailResponse.Data.ExtContent"));
		data.setStatus(_ctx.integerValue("DescribeCloudSiemEventDetailResponse.Data.Status"));
		data.setReferAccount(_ctx.stringValue("DescribeCloudSiemEventDetailResponse.Data.ReferAccount"));
		data.setIncidentType(_ctx.stringValue("DescribeCloudSiemEventDetailResponse.Data.IncidentType"));
		data.setRuleId(_ctx.stringValue("DescribeCloudSiemEventDetailResponse.Data.RuleId"));
		data.setRemark(_ctx.stringValue("DescribeCloudSiemEventDetailResponse.Data.Remark"));

		List<String> dataSources = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCloudSiemEventDetailResponse.Data.DataSources.Length"); i++) {
			dataSources.add(_ctx.stringValue("DescribeCloudSiemEventDetailResponse.Data.DataSources["+ i +"]"));
		}
		data.setDataSources(dataSources);

		List<String> attCkLabels = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCloudSiemEventDetailResponse.Data.AttCkLabels.Length"); i++) {
			attCkLabels.add(_ctx.stringValue("DescribeCloudSiemEventDetailResponse.Data.AttCkLabels["+ i +"]"));
		}
		data.setAttCkLabels(attCkLabels);

		List<AttckStage> attckStages = new ArrayList<AttckStage>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCloudSiemEventDetailResponse.Data.AttckStages.Length"); i++) {
			AttckStage attckStage = new AttckStage();
			attckStage.setTacticId(_ctx.stringValue("DescribeCloudSiemEventDetailResponse.Data.AttckStages["+ i +"].TacticId"));
			attckStage.setTacticName(_ctx.stringValue("DescribeCloudSiemEventDetailResponse.Data.AttckStages["+ i +"].TacticName"));
			attckStage.setAlertNum(_ctx.integerValue("DescribeCloudSiemEventDetailResponse.Data.AttckStages["+ i +"].AlertNum"));

			attckStages.add(attckStage);
		}
		data.setAttckStages(attckStages);
		describeCloudSiemEventDetailResponse.setData(data);
	 
	 	return describeCloudSiemEventDetailResponse;
	}
}