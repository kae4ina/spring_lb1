package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrganizationService {
    private List<OrganizationData> organizationDataList = new ArrayList<>();


    private final OrganizationData org;

    public void initOrganizationData() {
        OrganizationData org1=new OrganizationData(1,1,1,150000);
        OrganizationData org2=new OrganizationData(2,2,2,2000000);
        organizationDataList.add(org1);
        organizationDataList.add(org2);

    }
    @Autowired
    public OrganizationService(OrganizationData org) {
        this.org = org;
    }


    public void addOrganizationData(OrganizationData data) {
        organizationDataList.add(data);
    }

    public List<OrganizationData> getAllOrganizationData() {
        return organizationDataList;
    }
}
