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

import com.aliyuncs.aegis.model.v20161111.DescribeVulDetailsResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeVulDetailsResponse.Cve;
import com.aliyuncs.aegis.model.v20161111.DescribeVulDetailsResponse.Cve.Classify;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVulDetailsResponseUnmarshaller {

	public static DescribeVulDetailsResponse unmarshall(DescribeVulDetailsResponse describeVulDetailsResponse, UnmarshallerContext context) {
		
		describeVulDetailsResponse.setRequestId(context.stringValue("DescribeVulDetailsResponse.RequestId"));

		List<Cve> cves = new ArrayList<Cve>();
		for (int i = 0; i < context.lengthValue("DescribeVulDetailsResponse.Cves.Length"); i++) {
			Cve cve = new Cve();
			cve.setCveId(context.stringValue("DescribeVulDetailsResponse.Cves["+ i +"].CveId"));
			cve.setCnvdId(context.stringValue("DescribeVulDetailsResponse.Cves["+ i +"].CnvdId"));
			cve.setOtherId(context.stringValue("DescribeVulDetailsResponse.Cves["+ i +"].OtherId"));
			cve.setTitle(context.stringValue("DescribeVulDetailsResponse.Cves["+ i +"].Title"));
			cve.setCvssScore(context.stringValue("DescribeVulDetailsResponse.Cves["+ i +"].CvssScore"));
			cve.setCvssVector(context.stringValue("DescribeVulDetailsResponse.Cves["+ i +"].CvssVector"));
			cve.setReleaseTime(context.longValue("DescribeVulDetailsResponse.Cves["+ i +"].ReleaseTime"));
			cve.setComplexity(context.stringValue("DescribeVulDetailsResponse.Cves["+ i +"].Complexity"));
			cve.setPoc(context.stringValue("DescribeVulDetailsResponse.Cves["+ i +"].Poc"));
			cve.setPocCreateTime(context.longValue("DescribeVulDetailsResponse.Cves["+ i +"].PocCreateTime"));
			cve.setPocDisclosureTime(context.longValue("DescribeVulDetailsResponse.Cves["+ i +"].PocDisclosureTime"));
			cve.setSummary(context.stringValue("DescribeVulDetailsResponse.Cves["+ i +"].Summary"));
			cve.setSolution(context.stringValue("DescribeVulDetailsResponse.Cves["+ i +"].Solution"));
			cve.setContent(context.stringValue("DescribeVulDetailsResponse.Cves["+ i +"].Content"));
			cve.setVendor(context.stringValue("DescribeVulDetailsResponse.Cves["+ i +"].Vendor"));
			cve.setProduct(context.stringValue("DescribeVulDetailsResponse.Cves["+ i +"].Product"));
			cve.setVulLevel(context.stringValue("DescribeVulDetailsResponse.Cves["+ i +"].VulLevel"));
			cve.setReference(context.stringValue("DescribeVulDetailsResponse.Cves["+ i +"].Reference"));
			cve.setClassify(context.stringValue("DescribeVulDetailsResponse.Cves["+ i +"].Classify"));

			List<Classify> classifys = new ArrayList<Classify>();
			for (int j = 0; j < context.lengthValue("DescribeVulDetailsResponse.Cves["+ i +"].Classifys.Length"); j++) {
				Classify classify = new Classify();
				classify.setClassify(context.stringValue("DescribeVulDetailsResponse.Cves["+ i +"].Classifys["+ j +"].Classify"));
				classify.setDescription(context.stringValue("DescribeVulDetailsResponse.Cves["+ i +"].Classifys["+ j +"].Description"));
				classify.setDemoVideoUrl(context.stringValue("DescribeVulDetailsResponse.Cves["+ i +"].Classifys["+ j +"].DemoVideoUrl"));

				classifys.add(classify);
			}
			cve.setClassifys(classifys);

			cves.add(cve);
		}
		describeVulDetailsResponse.setCves(cves);
	 
	 	return describeVulDetailsResponse;
	}
}