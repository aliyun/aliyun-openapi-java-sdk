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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeGlobalDataNetworkListResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeGlobalDataNetworkListResponse.Items;
import com.aliyuncs.polardb.model.v20170801.DescribeGlobalDataNetworkListResponse.Items.Network;
import com.aliyuncs.polardb.model.v20170801.DescribeGlobalDataNetworkListResponse.Items.Network.Channel;
import com.aliyuncs.polardb.model.v20170801.DescribeGlobalDataNetworkListResponse.Items.Network.NetworkTopology;
import com.aliyuncs.polardb.model.v20170801.DescribeGlobalDataNetworkListResponse.Items.Network.NetworkTopology.Destination;
import com.aliyuncs.polardb.model.v20170801.DescribeGlobalDataNetworkListResponse.Items.Network.NetworkTopology.Source;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGlobalDataNetworkListResponseUnmarshaller {

	public static DescribeGlobalDataNetworkListResponse unmarshall(DescribeGlobalDataNetworkListResponse describeGlobalDataNetworkListResponse, UnmarshallerContext _ctx) {
		
		describeGlobalDataNetworkListResponse.setRequestId(_ctx.stringValue("DescribeGlobalDataNetworkListResponse.RequestId"));
		describeGlobalDataNetworkListResponse.setTotalRecordCount(_ctx.stringValue("DescribeGlobalDataNetworkListResponse.TotalRecordCount"));
		describeGlobalDataNetworkListResponse.setPageRecordCount(_ctx.stringValue("DescribeGlobalDataNetworkListResponse.PageRecordCount"));
		describeGlobalDataNetworkListResponse.setPageNumber(_ctx.stringValue("DescribeGlobalDataNetworkListResponse.PageNumber"));
		describeGlobalDataNetworkListResponse.setNextToken(_ctx.stringValue("DescribeGlobalDataNetworkListResponse.NextToken"));
		describeGlobalDataNetworkListResponse.setMaxResults(_ctx.integerValue("DescribeGlobalDataNetworkListResponse.MaxResults"));

		Items items = new Items();

		List<Network> networks = new ArrayList<Network>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGlobalDataNetworkListResponse.Items.Networks.Length"); i++) {
			Network network = new Network();
			network.setNetworkId(_ctx.stringValue("DescribeGlobalDataNetworkListResponse.Items.Networks["+ i +"].NetworkId"));
			network.setNetworkDescription(_ctx.stringValue("DescribeGlobalDataNetworkListResponse.Items.Networks["+ i +"].NetworkDescription"));
			network.setNetworkStatus(_ctx.stringValue("DescribeGlobalDataNetworkListResponse.Items.Networks["+ i +"].NetworkStatus"));
			network.setCreateTime(_ctx.stringValue("DescribeGlobalDataNetworkListResponse.Items.Networks["+ i +"].CreateTime"));

			NetworkTopology networkTopology = new NetworkTopology();

			List<Source> sources = new ArrayList<Source>();
			for (int j = 0; j < _ctx.lengthValue("DescribeGlobalDataNetworkListResponse.Items.Networks["+ i +"].NetworkTopology.Sources.Length"); j++) {
				Source source = new Source();
				source.setSourceFileSystemPath(_ctx.stringValue("DescribeGlobalDataNetworkListResponse.Items.Networks["+ i +"].NetworkTopology.Sources["+ j +"].SourceFileSystemPath"));
				source.setSourceType(_ctx.stringValue("DescribeGlobalDataNetworkListResponse.Items.Networks["+ i +"].NetworkTopology.Sources["+ j +"].SourceType"));
				source.setSourceRegion(_ctx.stringValue("DescribeGlobalDataNetworkListResponse.Items.Networks["+ i +"].NetworkTopology.Sources["+ j +"].SourceRegion"));
				source.setSourceId(_ctx.stringValue("DescribeGlobalDataNetworkListResponse.Items.Networks["+ i +"].NetworkTopology.Sources["+ j +"].SourceId"));

				sources.add(source);
			}
			networkTopology.setSources(sources);

			List<Destination> destinations = new ArrayList<Destination>();
			for (int j = 0; j < _ctx.lengthValue("DescribeGlobalDataNetworkListResponse.Items.Networks["+ i +"].NetworkTopology.Destinations.Length"); j++) {
				Destination destination = new Destination();
				destination.setDestinationFileSystemPath(_ctx.stringValue("DescribeGlobalDataNetworkListResponse.Items.Networks["+ i +"].NetworkTopology.Destinations["+ j +"].DestinationFileSystemPath"));
				destination.setDestinationRegion(_ctx.stringValue("DescribeGlobalDataNetworkListResponse.Items.Networks["+ i +"].NetworkTopology.Destinations["+ j +"].DestinationRegion"));
				destination.setDestinationType(_ctx.stringValue("DescribeGlobalDataNetworkListResponse.Items.Networks["+ i +"].NetworkTopology.Destinations["+ j +"].DestinationType"));
				destination.setDestinationId(_ctx.stringValue("DescribeGlobalDataNetworkListResponse.Items.Networks["+ i +"].NetworkTopology.Destinations["+ j +"].DestinationId"));

				destinations.add(destination);
			}
			networkTopology.setDestinations(destinations);
			network.setNetworkTopology(networkTopology);

			List<Channel> channels = new ArrayList<Channel>();
			for (int j = 0; j < _ctx.lengthValue("DescribeGlobalDataNetworkListResponse.Items.Networks["+ i +"].Channels.Length"); j++) {
				Channel channel = new Channel();
				channel.setChannelId(_ctx.stringValue("DescribeGlobalDataNetworkListResponse.Items.Networks["+ i +"].Channels["+ j +"].ChannelId"));
				channel.setChannelStatus(_ctx.stringValue("DescribeGlobalDataNetworkListResponse.Items.Networks["+ i +"].Channels["+ j +"].ChannelStatus"));
				channel.setProgress(_ctx.stringValue("DescribeGlobalDataNetworkListResponse.Items.Networks["+ i +"].Channels["+ j +"].Progress"));
				channel.setFreezeSourceDuringSync(_ctx.booleanValue("DescribeGlobalDataNetworkListResponse.Items.Networks["+ i +"].Channels["+ j +"].FreezeSourceDuringSync"));

				channels.add(channel);
			}
			network.setChannels(channels);

			networks.add(network);
		}
		items.setNetworks(networks);
		describeGlobalDataNetworkListResponse.setItems(items);
	 
	 	return describeGlobalDataNetworkListResponse;
	}
}