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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnOfflineLogDeliveryFieldResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnOfflineLogDeliveryFieldResponse.Field;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnOfflineLogDeliveryFieldResponseUnmarshaller {

	public static DescribeDcdnOfflineLogDeliveryFieldResponse unmarshall(DescribeDcdnOfflineLogDeliveryFieldResponse describeDcdnOfflineLogDeliveryFieldResponse, UnmarshallerContext _ctx) {
		
		describeDcdnOfflineLogDeliveryFieldResponse.setRequestId(_ctx.stringValue("DescribeDcdnOfflineLogDeliveryFieldResponse.RequestId"));

		List<Field> fields = new ArrayList<Field>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnOfflineLogDeliveryFieldResponse.Fields.Length"); i++) {
			Field field = new Field();
			field.setFieldId(_ctx.stringValue("DescribeDcdnOfflineLogDeliveryFieldResponse.Fields["+ i +"].FieldId"));
			field.setFieldName(_ctx.stringValue("DescribeDcdnOfflineLogDeliveryFieldResponse.Fields["+ i +"].FieldName"));
			field.setDescription(_ctx.stringValue("DescribeDcdnOfflineLogDeliveryFieldResponse.Fields["+ i +"].Description"));

			fields.add(field);
		}
		describeDcdnOfflineLogDeliveryFieldResponse.setFields(fields);
	 
	 	return describeDcdnOfflineLogDeliveryFieldResponse;
	}
}