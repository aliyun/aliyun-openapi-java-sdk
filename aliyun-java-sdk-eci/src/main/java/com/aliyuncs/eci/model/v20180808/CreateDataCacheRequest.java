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

package com.aliyuncs.eci.model.v20180808;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

import java.util.*;

/**
 * @author xiaohui
 * @version 1.4.0
 */
public class CreateDataCacheRequest extends RpcAcsRequest<CreateDataCacheResponse> {

    public CreateDataCacheRequest() {
        super("Eci", "2018-08-08", "CreateDataCache", "eci");
        setMethod(MethodType.POST);
    }

    private String securityGroupId;

    private String vSwitchId;

    private String bucket;

    private String path;

    private String name;

    private Integer size;

    private Integer retentionDays;

    private String resourceGroupId;

    private String clientToken;

    private String eipInstanceId;

    private DataSource dataSource;

    private EipCreateParam eipCreateParam;

    private List<Tag> tags;

    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        if (securityGroupId != null) {
            putQueryParameter("SecurityGroupId", securityGroupId);
        }
    }

    public String getVSwitchId() {
        return vSwitchId;
    }

    public void setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        if (vSwitchId != null) {
            putQueryParameter("VSwitchId", vSwitchId);
        }
    }

    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
        if (bucket != null) {
            putQueryParameter("Bucket", bucket);
        }
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
        if (path != null) {
            putQueryParameter("Path", path);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        if (name != null) {
            putQueryParameter("Name", name);
        }
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
        if (size != null) {
            putQueryParameter("Size", size);
        }
    }

    public Integer getRetentionDays() {
        return retentionDays;
    }

    public void setRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
        if (retentionDays !=null) {
            putQueryParameter("RetentionDays", retentionDays);
        }
    }

    public String getResourceGroupId() {
        return resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        if (resourceGroupId !=null) {
            putQueryParameter("ResourceGroupId", resourceGroupId);
        }
    }

    public String getClientToken() {
        return clientToken;
    }

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
        if (clientToken != null) {
            putQueryParameter("ClientToken", clientToken);
        }
    }

    public String getEipInstanceId() {
        return eipInstanceId;
    }

    public void setEipInstanceId(String eipInstanceId) {
        this.eipInstanceId = eipInstanceId;
        if (eipInstanceId != null) {
            putQueryParameter("EipInstanceId", eipInstanceId);
        }
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        if (dataSource.getType() != null) {
            putQueryParameter("DataSource.Type", dataSource.getType());
        }

        if (dataSource.getOptions() != null) {
            Set optionsSet = dataSource.getOptions().entrySet();
            for (Iterator iter = optionsSet.iterator(); iter.hasNext();) {
                Map.Entry entry = (Map.Entry)iter.next();
                String key = (String)entry.getKey();
                String value = (String)entry.getValue();
                putQueryParameter(String.format("DataSource.Options.#%s#%s", key.length(), key), value);
            }
        }
    }

    public EipCreateParam getEipCreateParam() {
        return eipCreateParam;
    }

    public void setEipCreateParam(EipCreateParam eipCreateParam) {
        this.eipCreateParam = eipCreateParam;
        if (eipCreateParam.getBandwidth() != null) {
            putQueryParameter("EipCreateParam.Bandwidth", eipCreateParam.getBandwidth());
        }
        if (eipCreateParam.getCommonBandwidthPackage() != null) {
            putQueryParameter("EipCreateParam.CommonBandwidthPackage", eipCreateParam.getCommonBandwidthPackage());
        }
        if (eipCreateParam.getInternetChargeType() != null) {
            putQueryParameter("EipCreateParam.InternetChargeType", eipCreateParam.getInternetChargeType());
        }
        if (eipCreateParam.getPublicIpAddressPoolId() != null) {
            putQueryParameter("EipCreateParam.PublicIpAddressPoolId", eipCreateParam.getPublicIpAddressPoolId());
        }
        if (eipCreateParam.getiSP() != null) {
            putQueryParameter("EipCreateParam.ISP", eipCreateParam.getiSP());
        }
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
        if (tags != null) {
            for (int i = 0; i < tags.size(); i++) {
                putQueryParameter("Tag." + (i + 1) + ".Key", tags.get(i).getKey());
                putQueryParameter("Tag." + (i + 1) + ".Value", tags.get(i).getValue());
            }
        }
    }

    public static class DataSource {

        private String type;

        private HashMap<String, String> options;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public HashMap<String, String> getOptions() {
            return options;
        }

        public void setOptions(HashMap<String, String> options) {
            this.options = options;
        }
    }

    public static class EipCreateParam {

        private Integer bandwidth;

        private String commonBandwidthPackage;

        private String internetChargeType;

        private String publicIpAddressPoolId;

        private String iSP;

        public Integer getBandwidth() {
            return bandwidth;
        }

        public void setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
        }

        public String getCommonBandwidthPackage() {
            return commonBandwidthPackage;
        }

        public void setCommonBandwidthPackage(String commonBandwidthPackage) {
            this.commonBandwidthPackage = commonBandwidthPackage;
        }

        public String getInternetChargeType() {
            return internetChargeType;
        }

        public void setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
        }

        public String getPublicIpAddressPoolId() {
            return publicIpAddressPoolId;
        }

        public void setPublicIpAddressPoolId(String publicIpAddressPoolId) {
            this.publicIpAddressPoolId = publicIpAddressPoolId;
        }

        public String getiSP() {
            return iSP;
        }

        public void setiSP(String iSP) {
            this.iSP = iSP;
        }
    }

    public static class Tag {

        private String key;

        private String value;

        public String getKey() {
            return this.key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getValue() {
            return this.value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    @Override
    public Class<CreateDataCacheResponse> getResponseClass() {
        return CreateDataCacheResponse.class;
    }


}
