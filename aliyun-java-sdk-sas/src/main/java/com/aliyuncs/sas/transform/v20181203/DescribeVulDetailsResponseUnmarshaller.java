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

import com.aliyuncs.sas.model.v20181203.DescribeVulDetailsResponse;
import com.aliyuncs.sas.model.v20181203.DescribeVulDetailsResponse.Cve;
import com.aliyuncs.sas.model.v20181203.DescribeVulDetailsResponse.Cve.Classify;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVulDetailsResponseUnmarshaller {

	public static DescribeVulDetailsResponse unmarshall(DescribeVulDetailsResponse describeVulDetailsResponse, UnmarshallerContext _ctx) {
		
		describeVulDetailsResponse.setRequestId(_ctx.stringValue("DescribeVulDetailsResponse.RequestId"));

		List<Cve> cves = new ArrayList<Cve>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVulDetailsResponse.Cves.Length"); i++) {
			Cve cve = new Cve();
			cve.setSummary(_ctx.stringValue("DescribeVulDetailsResponse.Cves["+ i +"].Summary"));
			cve.setComplexity(_ctx.stringValue("DescribeVulDetailsResponse.Cves["+ i +"].Complexity"));
			cve.setProduct(_ctx.stringValue("DescribeVulDetailsResponse.Cves["+ i +"].Product"));
			cve.setPocCreateTime(_ctx.longValue("DescribeVulDetailsResponse.Cves["+ i +"].PocCreateTime"));
			cve.setCveId(_ctx.stringValue("DescribeVulDetailsResponse.Cves["+ i +"].CveId"));
			cve.setCnvdId(_ctx.stringValue("DescribeVulDetailsResponse.Cves["+ i +"].CnvdId"));
			cve.setReference(_ctx.stringValue("DescribeVulDetailsResponse.Cves["+ i +"].Reference"));
			cve.setCvssScore(_ctx.stringValue("DescribeVulDetailsResponse.Cves["+ i +"].CvssScore"));
			cve.setVendor(_ctx.stringValue("DescribeVulDetailsResponse.Cves["+ i +"].Vendor"));
			cve.setPocDisclosureTime(_ctx.longValue("DescribeVulDetailsResponse.Cves["+ i +"].PocDisclosureTime"));
			cve.setClassify(_ctx.stringValue("DescribeVulDetailsResponse.Cves["+ i +"].Classify"));
			cve.setCvssVector(_ctx.stringValue("DescribeVulDetailsResponse.Cves["+ i +"].CvssVector"));
			cve.setVulLevel(_ctx.stringValue("DescribeVulDetailsResponse.Cves["+ i +"].VulLevel"));
			cve.setReleaseTime(_ctx.longValue("DescribeVulDetailsResponse.Cves["+ i +"].ReleaseTime"));
			cve.setTitle(_ctx.stringValue("DescribeVulDetailsResponse.Cves["+ i +"].Title"));
			cve.setSolution(_ctx.stringValue("DescribeVulDetailsResponse.Cves["+ i +"].Solution"));
			cve.setContent(_ctx.stringValue("DescribeVulDetailsResponse.Cves["+ i +"].Content"));
			cve.setPoc(_ctx.stringValue("DescribeVulDetailsResponse.Cves["+ i +"].Poc"));
			cve.setOtherId(_ctx.stringValue("DescribeVulDetailsResponse.Cves["+ i +"].OtherId"));

			List<Classify> classifys = new ArrayList<Classify>();
			for (int j = 0; j < _ctx.lengthValue("DescribeVulDetailsResponse.Cves["+ i +"].Classifys.Length"); j++) {
				Classify classify = new Classify();
				classify.setDescription(_ctx.stringValue("DescribeVulDetailsResponse.Cves["+ i +"].Classifys["+ j +"].Description"));
				classify.setClassify(_ctx.stringValue("DescribeVulDetailsResponse.Cves["+ i +"].Classifys["+ j +"].Classify"));
				classify.setDemoVideoUrl(_ctx.stringValue("DescribeVulDetailsResponse.Cves["+ i +"].Classifys["+ j +"].DemoVideoUrl"));

				classifys.add(classify);
			}
			cve.setClassifys(classifys);

			cves.add(cve);
		}
		describeVulDetailsResponse.setCves(cves);
	 
	 	return describeVulDetailsResponse;
	}
}