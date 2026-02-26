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

package com.aliyuncs.adb.transform.v20190315;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.adb.model.v20190315.DescribeDiagnosisSQLInfoResponse;
import com.aliyuncs.adb.model.v20190315.DescribeDiagnosisSQLInfoResponse.StageInfosItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDiagnosisSQLInfoResponseUnmarshaller {

	public static DescribeDiagnosisSQLInfoResponse unmarshall(DescribeDiagnosisSQLInfoResponse describeDiagnosisSQLInfoResponse, UnmarshallerContext _ctx) {
		
		describeDiagnosisSQLInfoResponse.setRequestId(_ctx.stringValue("DescribeDiagnosisSQLInfoResponse.RequestId"));
		describeDiagnosisSQLInfoResponse.setDiagnosisSQLInfo(_ctx.stringValue("DescribeDiagnosisSQLInfoResponse.DiagnosisSQLInfo"));

		List<StageInfosItem> stageInfos = new ArrayList<StageInfosItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDiagnosisSQLInfoResponse.StageInfos.Length"); i++) {
			StageInfosItem stageInfosItem = new StageInfosItem();
			stageInfosItem.setInputRows(_ctx.longValue("DescribeDiagnosisSQLInfoResponse.StageInfos["+ i +"].InputRows"));
			stageInfosItem.setInputDataSize(_ctx.longValue("DescribeDiagnosisSQLInfoResponse.StageInfos["+ i +"].InputDataSize"));
			stageInfosItem.setOutputRows(_ctx.longValue("DescribeDiagnosisSQLInfoResponse.StageInfos["+ i +"].OutputRows"));
			stageInfosItem.setOutputDataSize(_ctx.longValue("DescribeDiagnosisSQLInfoResponse.StageInfos["+ i +"].OutputDataSize"));
			stageInfosItem.setPeakMemory(_ctx.longValue("DescribeDiagnosisSQLInfoResponse.StageInfos["+ i +"].PeakMemory"));
			stageInfosItem.setOperatorCost(_ctx.longValue("DescribeDiagnosisSQLInfoResponse.StageInfos["+ i +"].OperatorCost"));
			stageInfosItem.setStageId(_ctx.stringValue("DescribeDiagnosisSQLInfoResponse.StageInfos["+ i +"].StageId"));
			stageInfosItem.setState(_ctx.stringValue("DescribeDiagnosisSQLInfoResponse.StageInfos["+ i +"].State"));
			stageInfosItem.setProgress(_ctx.doubleValue("DescribeDiagnosisSQLInfoResponse.StageInfos["+ i +"].Progress"));

			stageInfos.add(stageInfosItem);
		}
		describeDiagnosisSQLInfoResponse.setStageInfos(stageInfos);
	 
	 	return describeDiagnosisSQLInfoResponse;
	}
}