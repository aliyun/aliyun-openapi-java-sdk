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

package com.aliyuncs.aegis.transform.v20161111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aegis.model.v20161111.DescribeAlarmEventDetailResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeAlarmEventDetailResponse.Data;
import com.aliyuncs.aegis.model.v20161111.DescribeAlarmEventDetailResponse.Data.CauseDetail;
import com.aliyuncs.aegis.model.v20161111.DescribeAlarmEventDetailResponse.Data.CauseDetail.ValueItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAlarmEventDetailResponseUnmarshaller {

	public static DescribeAlarmEventDetailResponse unmarshall(DescribeAlarmEventDetailResponse describeAlarmEventDetailResponse, UnmarshallerContext context) {
		
		describeAlarmEventDetailResponse.setRequestId(context.stringValue("DescribeAlarmEventDetailResponse.RequestId"));

		Data data = new Data();
		data.setInternetIp(context.stringValue("DescribeAlarmEventDetailResponse.Data.InternetIp"));
		data.setLevel(context.stringValue("DescribeAlarmEventDetailResponse.Data.Level"));
		data.setInstanceName(context.stringValue("DescribeAlarmEventDetailResponse.Data.InstanceName"));
		data.setAlarmEventAliasName(context.stringValue("DescribeAlarmEventDetailResponse.Data.AlarmEventAliasName"));
		data.setType(context.stringValue("DescribeAlarmEventDetailResponse.Data.Type"));
		data.setUuid(context.stringValue("DescribeAlarmEventDetailResponse.Data.Uuid"));
		data.setSolution(context.stringValue("DescribeAlarmEventDetailResponse.Data.Solution"));
		data.setStartTime(context.longValue("DescribeAlarmEventDetailResponse.Data.StartTime"));
		data.setEndTime(context.longValue("DescribeAlarmEventDetailResponse.Data.EndTime"));
		data.setAlarmEventDesc(context.stringValue("DescribeAlarmEventDetailResponse.Data.AlarmEventDesc"));
		data.setIntranetIp(context.stringValue("DescribeAlarmEventDetailResponse.Data.IntranetIp"));
		data.setCanBeDealOnLine(context.booleanValue("DescribeAlarmEventDetailResponse.Data.CanBeDealOnLine"));
		data.setAlarmUniqueInfo(context.stringValue("DescribeAlarmEventDetailResponse.Data.AlarmUniqueInfo"));
		data.setDataSource(context.stringValue("DescribeAlarmEventDetailResponse.Data.DataSource"));
		data.setCanCancelFault(context.booleanValue("DescribeAlarmEventDetailResponse.Data.CanCancelFault"));

		List<CauseDetail> causeDetails = new ArrayList<CauseDetail>();
		for (int i = 0; i < context.lengthValue("DescribeAlarmEventDetailResponse.Data.CauseDetails.Length"); i++) {
			CauseDetail causeDetail = new CauseDetail();
			causeDetail.setKey(context.stringValue("DescribeAlarmEventDetailResponse.Data.CauseDetails["+ i +"].Key"));

			List<ValueItem> value = new ArrayList<ValueItem>();
			for (int j = 0; j < context.lengthValue("DescribeAlarmEventDetailResponse.Data.CauseDetails["+ i +"].Value.Length"); j++) {
				ValueItem valueItem = new ValueItem();
				valueItem.setName(context.stringValue("DescribeAlarmEventDetailResponse.Data.CauseDetails["+ i +"].Value["+ j +"].Name"));
				valueItem.setType(context.stringValue("DescribeAlarmEventDetailResponse.Data.CauseDetails["+ i +"].Value["+ j +"].Type"));
				valueItem.setValue(context.stringValue("DescribeAlarmEventDetailResponse.Data.CauseDetails["+ i +"].Value["+ j +"].Value"));

				value.add(valueItem);
			}
			causeDetail.setValue(value);

			causeDetails.add(causeDetail);
		}
		data.setCauseDetails(causeDetails);
		describeAlarmEventDetailResponse.setData(data);
	 
	 	return describeAlarmEventDetailResponse;
	}
}