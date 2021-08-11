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

package com.aliyuncs.ecd.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecd.model.v20200930.DescribeVulDetailsResponse;
import com.aliyuncs.ecd.model.v20200930.DescribeVulDetailsResponse.Cve;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVulDetailsResponseUnmarshaller {

	public static DescribeVulDetailsResponse unmarshall(DescribeVulDetailsResponse describeVulDetailsResponse, UnmarshallerContext _ctx) {
		
		describeVulDetailsResponse.setRequestId(_ctx.stringValue("DescribeVulDetailsResponse.RequestId"));

		List<Cve> cves = new ArrayList<Cve>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVulDetailsResponse.Cves.Length"); i++) {
			Cve cve = new Cve();
			cve.setCveId(_ctx.stringValue("DescribeVulDetailsResponse.Cves["+ i +"].CveId"));
			cve.setTitle(_ctx.stringValue("DescribeVulDetailsResponse.Cves["+ i +"].Title"));
			cve.setCvssScore(_ctx.stringValue("DescribeVulDetailsResponse.Cves["+ i +"].CvssScore"));
			cve.setSummary(_ctx.stringValue("DescribeVulDetailsResponse.Cves["+ i +"].Summary"));

			cves.add(cve);
		}
		describeVulDetailsResponse.setCves(cves);
	 
	 	return describeVulDetailsResponse;
	}
}