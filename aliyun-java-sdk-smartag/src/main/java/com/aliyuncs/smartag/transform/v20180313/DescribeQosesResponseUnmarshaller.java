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

package com.aliyuncs.smartag.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.smartag.model.v20180313.DescribeQosesResponse;
import com.aliyuncs.smartag.model.v20180313.DescribeQosesResponse.Qos;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeQosesResponseUnmarshaller {

	public static DescribeQosesResponse unmarshall(DescribeQosesResponse describeQosesResponse, UnmarshallerContext _ctx) {
		
		describeQosesResponse.setRequestId(_ctx.stringValue("DescribeQosesResponse.RequestId"));
		describeQosesResponse.setTotalCount(_ctx.integerValue("DescribeQosesResponse.TotalCount"));
		describeQosesResponse.setPageSize(_ctx.integerValue("DescribeQosesResponse.PageSize"));
		describeQosesResponse.setPageNumber(_ctx.integerValue("DescribeQosesResponse.PageNumber"));

		List<Qos> qoses = new ArrayList<Qos>();
		for (int i = 0; i < _ctx.lengthValue("DescribeQosesResponse.Qoses.Length"); i++) {
			Qos qos = new Qos();
			qos.setSagCount(_ctx.stringValue("DescribeQosesResponse.Qoses["+ i +"].SagCount"));
			qos.setQosId(_ctx.stringValue("DescribeQosesResponse.Qoses["+ i +"].QosId"));
			qos.setSmartAGIds(_ctx.stringValue("DescribeQosesResponse.Qoses["+ i +"].SmartAGIds"));
			qos.setQosName(_ctx.stringValue("DescribeQosesResponse.Qoses["+ i +"].QosName"));
			qos.setQosDescription(_ctx.stringValue("DescribeQosesResponse.Qoses["+ i +"].QosDescription"));

			qoses.add(qos);
		}
		describeQosesResponse.setQoses(qoses);
	 
	 	return describeQosesResponse;
	}
}