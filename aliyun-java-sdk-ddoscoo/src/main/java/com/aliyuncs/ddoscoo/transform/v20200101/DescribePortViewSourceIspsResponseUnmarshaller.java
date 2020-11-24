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

package com.aliyuncs.ddoscoo.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ddoscoo.model.v20200101.DescribePortViewSourceIspsResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribePortViewSourceIspsResponse.Isp;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePortViewSourceIspsResponseUnmarshaller {

	public static DescribePortViewSourceIspsResponse unmarshall(DescribePortViewSourceIspsResponse describePortViewSourceIspsResponse, UnmarshallerContext _ctx) {
		
		describePortViewSourceIspsResponse.setRequestId(_ctx.stringValue("DescribePortViewSourceIspsResponse.RequestId"));

		List<Isp> isps = new ArrayList<Isp>();
		for (int i = 0; i < _ctx.lengthValue("DescribePortViewSourceIspsResponse.Isps.Length"); i++) {
			Isp isp = new Isp();
			isp.setIspId(_ctx.stringValue("DescribePortViewSourceIspsResponse.Isps["+ i +"].IspId"));
			isp.setCount(_ctx.longValue("DescribePortViewSourceIspsResponse.Isps["+ i +"].Count"));

			isps.add(isp);
		}
		describePortViewSourceIspsResponse.setIsps(isps);
	 
	 	return describePortViewSourceIspsResponse;
	}
}