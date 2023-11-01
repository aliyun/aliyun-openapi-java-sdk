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

import com.aliyuncs.cloud_siem.model.v20220616.DescribeAttackTimeLineResponse;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeAttackTimeLineResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAttackTimeLineResponseUnmarshaller {

	public static DescribeAttackTimeLineResponse unmarshall(DescribeAttackTimeLineResponse describeAttackTimeLineResponse, UnmarshallerContext _ctx) {
		
		describeAttackTimeLineResponse.setRequestId(_ctx.stringValue("DescribeAttackTimeLineResponse.RequestId"));
		describeAttackTimeLineResponse.setSuccess(_ctx.booleanValue("DescribeAttackTimeLineResponse.Success"));
		describeAttackTimeLineResponse.setCode(_ctx.integerValue("DescribeAttackTimeLineResponse.Code"));
		describeAttackTimeLineResponse.setMessage(_ctx.stringValue("DescribeAttackTimeLineResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAttackTimeLineResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAssetName(_ctx.stringValue("DescribeAttackTimeLineResponse.Data["+ i +"].AssetName"));
			dataItem.setAlertTime(_ctx.longValue("DescribeAttackTimeLineResponse.Data["+ i +"].AlertTime"));
			dataItem.setAssetId(_ctx.stringValue("DescribeAttackTimeLineResponse.Data["+ i +"].AssetId"));
			dataItem.setIncidentUuid(_ctx.stringValue("DescribeAttackTimeLineResponse.Data["+ i +"].IncidentUuid"));
			dataItem.setAlertUuid(_ctx.stringValue("DescribeAttackTimeLineResponse.Data["+ i +"].AlertUuid"));
			dataItem.setLogTime(_ctx.stringValue("DescribeAttackTimeLineResponse.Data["+ i +"].LogTime"));
			dataItem.setAlertSrcProd(_ctx.stringValue("DescribeAttackTimeLineResponse.Data["+ i +"].AlertSrcProd"));
			dataItem.setAlertTitle(_ctx.stringValue("DescribeAttackTimeLineResponse.Data["+ i +"].AlertTitle"));
			dataItem.setAlertLevel(_ctx.stringValue("DescribeAttackTimeLineResponse.Data["+ i +"].AlertLevel"));
			dataItem.setAssetList(_ctx.stringValue("DescribeAttackTimeLineResponse.Data["+ i +"].AssetList"));
			dataItem.setAlertSrcProdModule(_ctx.stringValue("DescribeAttackTimeLineResponse.Data["+ i +"].AlertSrcProdModule"));
			dataItem.setAttCk(_ctx.stringValue("DescribeAttackTimeLineResponse.Data["+ i +"].AttCk"));
			dataItem.setCloudCode(_ctx.stringValue("DescribeAttackTimeLineResponse.Data["+ i +"].CloudCode"));
			dataItem.setAlertTitleEn(_ctx.stringValue("DescribeAttackTimeLineResponse.Data["+ i +"].AlertTitleEn"));
			dataItem.setAlertType(_ctx.stringValue("DescribeAttackTimeLineResponse.Data["+ i +"].AlertType"));
			dataItem.setAlertTypeEn(_ctx.stringValue("DescribeAttackTimeLineResponse.Data["+ i +"].AlertTypeEn"));
			dataItem.setAlertTypeCode(_ctx.stringValue("DescribeAttackTimeLineResponse.Data["+ i +"].AlertTypeCode"));
			dataItem.setAlertName(_ctx.stringValue("DescribeAttackTimeLineResponse.Data["+ i +"].AlertName"));
			dataItem.setAlertNameEn(_ctx.stringValue("DescribeAttackTimeLineResponse.Data["+ i +"].AlertNameEn"));
			dataItem.setAlertNameCode(_ctx.stringValue("DescribeAttackTimeLineResponse.Data["+ i +"].AlertNameCode"));

			data.add(dataItem);
		}
		describeAttackTimeLineResponse.setData(data);
	 
	 	return describeAttackTimeLineResponse;
	}
}