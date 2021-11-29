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

package com.aliyuncs.dcdn.transform.v20180115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnUserRealTimeDeliveryFieldResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnUserRealTimeDeliveryFieldResponse.Fields;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnUserRealTimeDeliveryFieldResponseUnmarshaller {

	public static DescribeDcdnUserRealTimeDeliveryFieldResponse unmarshall(DescribeDcdnUserRealTimeDeliveryFieldResponse describeDcdnUserRealTimeDeliveryFieldResponse, UnmarshallerContext _ctx) {
		
		describeDcdnUserRealTimeDeliveryFieldResponse.setRequestId(_ctx.stringValue("DescribeDcdnUserRealTimeDeliveryFieldResponse.RequestId"));

		List<Fields> content = new ArrayList<Fields>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnUserRealTimeDeliveryFieldResponse.Content.Length"); i++) {
			Fields fields = new Fields();
			fields.setFieldName(_ctx.stringValue("DescribeDcdnUserRealTimeDeliveryFieldResponse.Content["+ i +"].FieldName"));
			fields.setDescription(_ctx.stringValue("DescribeDcdnUserRealTimeDeliveryFieldResponse.Content["+ i +"].Description"));
			fields.setSelected(_ctx.booleanValue("DescribeDcdnUserRealTimeDeliveryFieldResponse.Content["+ i +"].Selected"));

			content.add(fields);
		}
		describeDcdnUserRealTimeDeliveryFieldResponse.setContent(content);
	 
	 	return describeDcdnUserRealTimeDeliveryFieldResponse;
	}
}