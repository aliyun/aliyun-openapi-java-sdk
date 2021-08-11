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

import com.aliyuncs.ecd.model.v20200930.DescribeCensResponse;
import com.aliyuncs.ecd.model.v20200930.DescribeCensResponse.Cen;
import com.aliyuncs.ecd.model.v20200930.DescribeCensResponse.Cen.PackageId;
import com.aliyuncs.ecd.model.v20200930.DescribeCensResponse.Cen.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCensResponseUnmarshaller {

	public static DescribeCensResponse unmarshall(DescribeCensResponse describeCensResponse, UnmarshallerContext _ctx) {
		
		describeCensResponse.setRequestId(_ctx.stringValue("DescribeCensResponse.RequestId"));
		describeCensResponse.setTotalCount(_ctx.integerValue("DescribeCensResponse.TotalCount"));
		describeCensResponse.setPageNumber(_ctx.integerValue("DescribeCensResponse.PageNumber"));
		describeCensResponse.setPageSize(_ctx.integerValue("DescribeCensResponse.PageSize"));

		List<Cen> cens = new ArrayList<Cen>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCensResponse.Cens.Length"); i++) {
			Cen cen = new Cen();
			cen.setCenId(_ctx.stringValue("DescribeCensResponse.Cens["+ i +"].CenId"));
			cen.setName(_ctx.stringValue("DescribeCensResponse.Cens["+ i +"].Name"));
			cen.setDescription(_ctx.stringValue("DescribeCensResponse.Cens["+ i +"].Description"));
			cen.setProtectionLevel(_ctx.stringValue("DescribeCensResponse.Cens["+ i +"].ProtectionLevel"));
			cen.setStatus(_ctx.stringValue("DescribeCensResponse.Cens["+ i +"].Status"));
			cen.setCreationTime(_ctx.stringValue("DescribeCensResponse.Cens["+ i +"].CreationTime"));
			cen.setIpv6Level(_ctx.stringValue("DescribeCensResponse.Cens["+ i +"].Ipv6Level"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCensResponse.Cens["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("DescribeCensResponse.Cens["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("DescribeCensResponse.Cens["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			cen.setTags(tags);

			List<PackageId> packageIds = new ArrayList<PackageId>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCensResponse.Cens["+ i +"].PackageIds.Length"); j++) {
				PackageId packageId = new PackageId();
				packageId.setPackageId(_ctx.stringValue("DescribeCensResponse.Cens["+ i +"].PackageIds["+ j +"].PackageId"));

				packageIds.add(packageId);
			}
			cen.setPackageIds(packageIds);

			cens.add(cen);
		}
		describeCensResponse.setCens(cens);
	 
	 	return describeCensResponse;
	}
}