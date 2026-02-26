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

package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.DescribeVpnAttachmentsResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeVpnAttachmentsResponse.VpnAttachment;
import com.aliyuncs.vpc.model.v20160428.DescribeVpnAttachmentsResponse.VpnAttachment.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVpnAttachmentsResponseUnmarshaller {

	public static DescribeVpnAttachmentsResponse unmarshall(DescribeVpnAttachmentsResponse describeVpnAttachmentsResponse, UnmarshallerContext _ctx) {
		
		describeVpnAttachmentsResponse.setRequestId(_ctx.stringValue("DescribeVpnAttachmentsResponse.RequestId"));
		describeVpnAttachmentsResponse.setPageSize(_ctx.integerValue("DescribeVpnAttachmentsResponse.PageSize"));
		describeVpnAttachmentsResponse.setPageNumber(_ctx.integerValue("DescribeVpnAttachmentsResponse.PageNumber"));
		describeVpnAttachmentsResponse.setTotalCount(_ctx.integerValue("DescribeVpnAttachmentsResponse.TotalCount"));

		List<VpnAttachment> vpnAttachments = new ArrayList<VpnAttachment>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVpnAttachmentsResponse.VpnAttachments.Length"); i++) {
			VpnAttachment vpnAttachment = new VpnAttachment();
			vpnAttachment.setInstanceId(_ctx.stringValue("DescribeVpnAttachmentsResponse.VpnAttachments["+ i +"].InstanceId"));
			vpnAttachment.setName(_ctx.stringValue("DescribeVpnAttachmentsResponse.VpnAttachments["+ i +"].Name"));
			vpnAttachment.setDescription(_ctx.stringValue("DescribeVpnAttachmentsResponse.VpnAttachments["+ i +"].Description"));
			vpnAttachment.setAttachType(_ctx.stringValue("DescribeVpnAttachmentsResponse.VpnAttachments["+ i +"].AttachType"));
			vpnAttachment.setTransitRouterId(_ctx.stringValue("DescribeVpnAttachmentsResponse.VpnAttachments["+ i +"].TransitRouterId"));
			vpnAttachment.setTransitRouterName(_ctx.stringValue("DescribeVpnAttachmentsResponse.VpnAttachments["+ i +"].TransitRouterName"));
			vpnAttachment.setCrossAccountAuthorized(_ctx.booleanValue("DescribeVpnAttachmentsResponse.VpnAttachments["+ i +"].CrossAccountAuthorized"));
			vpnAttachment.setTag(_ctx.stringValue("DescribeVpnAttachmentsResponse.VpnAttachments["+ i +"].Tag"));
			vpnAttachment.setTunnelBandwidth(_ctx.stringValue("DescribeVpnAttachmentsResponse.VpnAttachments["+ i +"].TunnelBandwidth"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeVpnAttachmentsResponse.VpnAttachments["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("DescribeVpnAttachmentsResponse.VpnAttachments["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("DescribeVpnAttachmentsResponse.VpnAttachments["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			vpnAttachment.setTags(tags);

			vpnAttachments.add(vpnAttachment);
		}
		describeVpnAttachmentsResponse.setVpnAttachments(vpnAttachments);
	 
	 	return describeVpnAttachmentsResponse;
	}
}