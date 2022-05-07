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

import com.aliyuncs.vpc.model.v20160428.ListPublicIpAddressPoolsResponse;
import com.aliyuncs.vpc.model.v20160428.ListPublicIpAddressPoolsResponse.PublicIpAddressPool;
import com.aliyuncs.vpc.model.v20160428.ListPublicIpAddressPoolsResponse.PublicIpAddressPool.PublicIpCidrBlock;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPublicIpAddressPoolsResponseUnmarshaller {

	public static ListPublicIpAddressPoolsResponse unmarshall(ListPublicIpAddressPoolsResponse listPublicIpAddressPoolsResponse, UnmarshallerContext _ctx) {
		
		listPublicIpAddressPoolsResponse.setRequestId(_ctx.stringValue("ListPublicIpAddressPoolsResponse.RequestId"));
		listPublicIpAddressPoolsResponse.setNextToken(_ctx.stringValue("ListPublicIpAddressPoolsResponse.NextToken"));
		listPublicIpAddressPoolsResponse.setMaxResults(_ctx.integerValue("ListPublicIpAddressPoolsResponse.MaxResults"));
		listPublicIpAddressPoolsResponse.setTotalCount(_ctx.integerValue("ListPublicIpAddressPoolsResponse.TotalCount"));

		List<PublicIpAddressPool> publicIpAddressPoolList = new ArrayList<PublicIpAddressPool>();
		for (int i = 0; i < _ctx.lengthValue("ListPublicIpAddressPoolsResponse.PublicIpAddressPoolList.Length"); i++) {
			PublicIpAddressPool publicIpAddressPool = new PublicIpAddressPool();
			publicIpAddressPool.setPublicIpAddressPoolId(_ctx.stringValue("ListPublicIpAddressPoolsResponse.PublicIpAddressPoolList["+ i +"].PublicIpAddressPoolId"));
			publicIpAddressPool.setRegionId(_ctx.stringValue("ListPublicIpAddressPoolsResponse.PublicIpAddressPoolList["+ i +"].RegionId"));
			publicIpAddressPool.setCreationTime(_ctx.stringValue("ListPublicIpAddressPoolsResponse.PublicIpAddressPoolList["+ i +"].CreationTime"));
			publicIpAddressPool.setIsp(_ctx.stringValue("ListPublicIpAddressPoolsResponse.PublicIpAddressPoolList["+ i +"].Isp"));
			publicIpAddressPool.setName(_ctx.stringValue("ListPublicIpAddressPoolsResponse.PublicIpAddressPoolList["+ i +"].Name"));
			publicIpAddressPool.setStatus(_ctx.stringValue("ListPublicIpAddressPoolsResponse.PublicIpAddressPoolList["+ i +"].Status"));
			publicIpAddressPool.setDescription(_ctx.stringValue("ListPublicIpAddressPoolsResponse.PublicIpAddressPoolList["+ i +"].Description"));
			publicIpAddressPool.setTotalIpNum(_ctx.integerValue("ListPublicIpAddressPoolsResponse.PublicIpAddressPoolList["+ i +"].TotalIpNum"));
			publicIpAddressPool.setUsedIpNum(_ctx.integerValue("ListPublicIpAddressPoolsResponse.PublicIpAddressPoolList["+ i +"].UsedIpNum"));
			publicIpAddressPool.setIpAddressRemaining(_ctx.booleanValue("ListPublicIpAddressPoolsResponse.PublicIpAddressPoolList["+ i +"].IpAddressRemaining"));
			publicIpAddressPool.setUserType(_ctx.booleanValue("ListPublicIpAddressPoolsResponse.PublicIpAddressPoolList["+ i +"].UserType"));

			List<PublicIpCidrBlock> publicIpCidrBlockList = new ArrayList<PublicIpCidrBlock>();
			for (int j = 0; j < _ctx.lengthValue("ListPublicIpAddressPoolsResponse.PublicIpAddressPoolList["+ i +"].PublicIpCidrBlockList.Length"); j++) {
				PublicIpCidrBlock publicIpCidrBlock = new PublicIpCidrBlock();
				publicIpCidrBlock.setCidrBlock(_ctx.stringValue("ListPublicIpAddressPoolsResponse.PublicIpAddressPoolList["+ i +"].PublicIpCidrBlockList["+ j +"].CidrBlock"));
				publicIpCidrBlock.setStatus(_ctx.stringValue("ListPublicIpAddressPoolsResponse.PublicIpAddressPoolList["+ i +"].PublicIpCidrBlockList["+ j +"].Status"));
				publicIpCidrBlock.setTotalIpNum(_ctx.integerValue("ListPublicIpAddressPoolsResponse.PublicIpAddressPoolList["+ i +"].PublicIpCidrBlockList["+ j +"].TotalIpNum"));
				publicIpCidrBlock.setUsedIpNum(_ctx.integerValue("ListPublicIpAddressPoolsResponse.PublicIpAddressPoolList["+ i +"].PublicIpCidrBlockList["+ j +"].UsedIpNum"));
				publicIpCidrBlock.setCreationTime(_ctx.stringValue("ListPublicIpAddressPoolsResponse.PublicIpAddressPoolList["+ i +"].PublicIpCidrBlockList["+ j +"].CreationTime"));

				publicIpCidrBlockList.add(publicIpCidrBlock);
			}
			publicIpAddressPool.setPublicIpCidrBlockList(publicIpCidrBlockList);

			publicIpAddressPoolList.add(publicIpAddressPool);
		}
		listPublicIpAddressPoolsResponse.setPublicIpAddressPoolList(publicIpAddressPoolList);
	 
	 	return listPublicIpAddressPoolsResponse;
	}
}