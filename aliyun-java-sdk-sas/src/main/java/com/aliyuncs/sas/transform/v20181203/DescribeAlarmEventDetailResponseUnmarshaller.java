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

import com.aliyuncs.sas.model.v20181203.DescribeAlarmEventDetailResponse;
import com.aliyuncs.sas.model.v20181203.DescribeAlarmEventDetailResponse.Data;
import com.aliyuncs.sas.model.v20181203.DescribeAlarmEventDetailResponse.Data.CauseDetail;
import com.aliyuncs.sas.model.v20181203.DescribeAlarmEventDetailResponse.Data.CauseDetail.ValueItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAlarmEventDetailResponseUnmarshaller {

	public static DescribeAlarmEventDetailResponse unmarshall(DescribeAlarmEventDetailResponse describeAlarmEventDetailResponse, UnmarshallerContext _ctx) {
		
		describeAlarmEventDetailResponse.setRequestId(_ctx.stringValue("DescribeAlarmEventDetailResponse.RequestId"));

		Data data = new Data();
		data.setInternetIp(_ctx.stringValue("DescribeAlarmEventDetailResponse.Data.InternetIp"));
		data.setLevel(_ctx.stringValue("DescribeAlarmEventDetailResponse.Data.Level"));
		data.setInstanceName(_ctx.stringValue("DescribeAlarmEventDetailResponse.Data.InstanceName"));
		data.setAlarmEventAliasName(_ctx.stringValue("DescribeAlarmEventDetailResponse.Data.AlarmEventAliasName"));
		data.setType(_ctx.stringValue("DescribeAlarmEventDetailResponse.Data.Type"));
		data.setUuid(_ctx.stringValue("DescribeAlarmEventDetailResponse.Data.Uuid"));
		data.setSolution(_ctx.stringValue("DescribeAlarmEventDetailResponse.Data.Solution"));
		data.setStartTime(_ctx.longValue("DescribeAlarmEventDetailResponse.Data.StartTime"));
		data.setEndTime(_ctx.longValue("DescribeAlarmEventDetailResponse.Data.EndTime"));
		data.setAlarmEventDesc(_ctx.stringValue("DescribeAlarmEventDetailResponse.Data.AlarmEventDesc"));
		data.setIntranetIp(_ctx.stringValue("DescribeAlarmEventDetailResponse.Data.IntranetIp"));
		data.setCanBeDealOnLine(_ctx.booleanValue("DescribeAlarmEventDetailResponse.Data.CanBeDealOnLine"));
		data.setAlarmUniqueInfo(_ctx.stringValue("DescribeAlarmEventDetailResponse.Data.AlarmUniqueInfo"));
		data.setDataSource(_ctx.stringValue("DescribeAlarmEventDetailResponse.Data.DataSource"));
		data.setCanCancelFault(_ctx.booleanValue("DescribeAlarmEventDetailResponse.Data.CanCancelFault"));
		data.setContainHwMode(_ctx.booleanValue("DescribeAlarmEventDetailResponse.Data.ContainHwMode"));

		List<CauseDetail> causeDetails = new ArrayList<CauseDetail>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAlarmEventDetailResponse.Data.CauseDetails.Length"); i++) {
			CauseDetail causeDetail = new CauseDetail();
			causeDetail.setKey(_ctx.stringValue("DescribeAlarmEventDetailResponse.Data.CauseDetails["+ i +"].Key"));

			List<ValueItem> value = new ArrayList<ValueItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAlarmEventDetailResponse.Data.CauseDetails["+ i +"].Value.Length"); j++) {
				ValueItem valueItem = new ValueItem();
				valueItem.setName(_ctx.stringValue("DescribeAlarmEventDetailResponse.Data.CauseDetails["+ i +"].Value["+ j +"].Name"));
				valueItem.setType(_ctx.stringValue("DescribeAlarmEventDetailResponse.Data.CauseDetails["+ i +"].Value["+ j +"].Type"));
				valueItem.setValue(_ctx.stringValue("DescribeAlarmEventDetailResponse.Data.CauseDetails["+ i +"].Value["+ j +"].Value"));

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